const express = require("express");
const bodyParser = require("body-parser");
const path = require("path");
const twilio = require("twilio");
const cors = require("cors");
const { sendWhatsAppMessage, getGeminiReply } = require("./whatsapp");

const app = express();
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());
app.use(cors());

// --- Twilio Config ---
const accountSid = "AC693a1ea71e4de59b465a6f88a2ef774d"; // Your SID
const authToken = "5da901a59a1bb1ccddef8642bd5c320c"; // Your Auth Token
const client = twilio(accountSid, authToken);
const fromNumber = "whatsapp:+14155238886"; // Twilio Sandbox number
const toNumber = "whatsapp:+918328876865"; // Your WhatsApp number
const MessagingResponse = twilio.twiml.MessagingResponse;
const GEMINI_API_KEY = "AIzaSyD9n6UXpU1IWa-AVdVqnfeU7QOQVNHyo5o";

// --- Alerts Storage ---
let alerts = [];

// --- Endpoint to Add Alert ---
app.post("/add-alert", (req, res) => {
  const { name, time, type } = req.body;

  if (!name || !time || !type) {
    return res
      .status(400)
      .json({ success: false, message: "All fields are required" });
  }

  const alertObj = { name, time, type };
  alerts.push(alertObj);

  // Send WhatsApp immediately
  client.messages
    .create({
      from: fromNumber,
      to: toNumber,
      body: `✅ Your schedule is set for ${type}: ${name} at ${new Date(
        time
      ).toLocaleString()}`,
    })
    .then((msg) => console.log("Immediate WhatsApp sent:", msg.sid))
    .catch((err) => console.error("Error sending WhatsApp:", err));

  // Schedule WhatsApp for future
  const delay = new Date(time) - new Date();
  if (delay > 0) {
    setTimeout(() => {
      client.messages
        .create({
          from: fromNumber,
          to: toNumber,
          body: `⏰ Reminder: Time for ${type} - Take ${name}`,
        })
        .then((msg) => console.log("Scheduled WhatsApp sent:", msg.sid))
        .catch((err) =>
          console.error("Error sending scheduled WhatsApp:", err)
        );
    }, delay);
  }

  res.json({ success: true, alert: alertObj });
});

app.post("/send-alert", (req, res) => {
  const { district, disease, severity, cases } = req.body;

  if (!district || !disease || !severity || !cases) {
    return res
      .status(400)
      .json({ success: false, message: "All fields are required" });
  }

  const alertObj = { district, disease, severity, cases };
  alerts.push(alertObj);

  // Immediate WhatsApp alert
  client.messages
    .create({
      from: fromNumber,
      to: toNumber,
      body: `🚨 Health Alert 🚨
District: ${district}
Disease: ${disease}
Severity: ${severity.toUpperCase()}
Cases Reported: ${cases}`,
    })
    .then((msg) => console.log("Immediate WhatsApp sent:", msg.sid))
    .catch((err) => console.error("Error sending WhatsApp:", err));

  res.json({ success: true, alert: alertObj });
});


// --- WhatsApp Webhook for Chatbot ---
const fetch = require("node-fetch"); // <-- add this at top of file if Node < 18

app.post("/whatsapp-webhook", async (req, res) => {
  console.log("📩 Incoming webhook:", req.body);

  const incomingMsg = req.body.Body || "";
  const from = req.body.From; // User's WhatsApp number
  const to = req.body.To;     // Your Twilio WhatsApp number

  try {
    // 1. Get AI-generated reply
    const reply = await getGeminiReply(incomingMsg);

    // 2. Send reply back to user via Twilio
    await sendWhatsAppMessage(to, from, reply);

    res.sendStatus(200); // Acknowledge webhook
  } catch (err) {
    console.error("❌ Error:", err);
    res.status(500).send("⚠️ Error processing the message.");
  }
});

// ✅ (Optional) Status callback endpoint
app.post("/status", (req, res) => {
  console.log("📊 Status callback:", req.body);
  res.sendStatus(200);
});

app.listen(3000, () => {
  console.log("🚀 Server running on http://localhost:3000");
});

const PORT = 5503;

app.listen(PORT, () => {
  console.log(`🚀 Server running on http://localhost:${PORT}`);
});
