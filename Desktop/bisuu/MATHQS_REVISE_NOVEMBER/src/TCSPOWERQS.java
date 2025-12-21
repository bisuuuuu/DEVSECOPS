//input 1234
//1*2^0 =	1     2*2^1 =4  3*2^0 =3  4*2^1=8   
//using string.ValueOf
public class TCSPOWERQS {
	public static void main(String[] args) {
		int i=1234;
		String s=String.valueOf(i);
		int power=0;
		int sum=0;
		int n=s.length();
		int half=n/2;
		int count=0;
		for(int j=0;j<n;j++) {
			int digit=s.charAt(j)-'0';
			sum+=digit*Math.pow(2,power);
			power++;
			if(power==half) {
				power=0;
			}
		}System.out.println(sum);

	}

}
