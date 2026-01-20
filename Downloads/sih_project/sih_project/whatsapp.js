const fetch = require("node-fetch");
const twilio = require("twilio");

const accountSid = "AC693a1ea71e4de59b465a6f88a2ef774d";
const authToken = "5da901a59a1bb1ccddef8642bd5c320c";
const client = twilio(accountSid, authToken);

const GEMINI_API_KEY = "AIzaSyD9n6UXpU1IWa-AVdVqnfeU7QOQVNHyo5o";

// ✅ Call Gemini API
async function getGeminiReply(userMsg) {
  try {
    const response = await fetch(
      `https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=${GEMINI_API_KEY}`,
      {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({
          contents: [{ parts: [{ text: userMsg }] }],
        }),
      }
    );

    const data = await response.json();
    console.log("🤖 Gemini API response:", data);

    return (
      data?.candidates?.[0]?.content?.parts?.[0]?.text ||
      "Sorry, I couldn't understand that."
    );
  } catch (err) {
    console.error("❌ Gemini API Error:", err);
    return "⚠️ Error: Couldn’t get a response right now.";
  }
}

// ✅ Send WhatsApp reply using Twilio
async function sendWhatsAppMessage(from, to, message) {
  try {
    // Split into chunks of 1600 characters max
    const chunks = message.match(/[\s\S]{1,1600}/g);

    for (const chunk of chunks) {
      await client.messages.create({
        body: chunk,
        from, // Twilio WhatsApp number
        to,   // User WhatsApp number
      });
      console.log(`✅ Sent chunk to ${to}: ${chunk.substring(0, 50)}...`);
    }
  } catch (err) {
    console.error("❌ Twilio Send Error:", err);
  }
}


module.exports = { sendWhatsAppMessage, getGeminiReply };
