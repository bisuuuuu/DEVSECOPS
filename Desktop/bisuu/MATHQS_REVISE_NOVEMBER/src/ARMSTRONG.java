import java.util.Scanner;
public class ARMSTRONG {
	public static boolean armstrong(int a) {
		int org=a;
		int rev=0;
		while(a>0) {
			int digit=a%10;
			rev=rev+(digit*digit*digit);
			a=a/10;
		}
		return rev==org;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int x=371;
System.out.println(armstrong(x));
	}
}
