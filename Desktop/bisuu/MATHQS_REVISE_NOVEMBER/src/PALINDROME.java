import java.util.Scanner;

public class PALINDROME {
public static boolean palindrome(int a) {
	
	int original=a;
	int rev=0;
	while(a>0) {
		int a1=a%10;//get last digit
		rev=rev*10+a1;
		a=a/10;//remove last digit
	}
	 return original==rev;  
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(palindrome(x));
}
	}


