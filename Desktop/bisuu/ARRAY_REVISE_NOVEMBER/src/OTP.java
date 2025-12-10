import java.util.Random;
public class OTP {
	public static void main(String[] args) {
		Random random=new Random();
		String otp=" ";
		for(int i=1;i<=4;i++) {
			int digit=random.nextInt(10);
			otp=otp+digit;
		}
System.out.println(otp);
	}

}
