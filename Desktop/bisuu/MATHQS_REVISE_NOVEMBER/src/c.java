import java.util.Scanner;
public class c {
	public static boolean prime(int a) {
	if(a<=1) {
		return false;
	}for(int i=2;i<Math.sqrt(a);i++) {
		if(a%i==0) {
			break;
		}
	}
	return true;
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			System.out.println(prime(x));
	}

}
