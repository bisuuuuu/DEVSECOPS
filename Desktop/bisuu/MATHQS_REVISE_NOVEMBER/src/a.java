import java.util.Scanner;
public class a {
	public static int countdigit(int a) {
		int count=0;
		while(a>0) {
			a=a/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int x=1234;
System.out.println(countdigit(x));
	}

}
