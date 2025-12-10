
import java.util.Scanner;
public class FACTORIAL {
	public static int factorial(int a) {
		if(a==0||a==1) {
			return 1;
		
		}else {
			return a*factorial(a-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(factorial(x));
			
	}

}

/* ITERATIVE METHOD
int res=1;
for(int i=1;i<=x;i++) {
res=res*i;
}
System.out.println(res);*/