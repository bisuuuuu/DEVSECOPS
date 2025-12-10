
import java.util.Scanner;
public class b {
	public static boolean palindrome(int a) {
		int original=a;
		int rev=0;
		while(a>0) {
			int digit=a%10;
			rev=rev*10+digit;
			a=a/10;
		}
		return rev==original;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			System.out.println(palindrome(x));
	}

}
