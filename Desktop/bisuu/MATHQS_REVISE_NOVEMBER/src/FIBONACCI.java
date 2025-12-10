
import java.util.Scanner;
public class FIBONACCI {
	//recursion method
	public static int fibo(int a) {
		if(a==0||a==1) {
			return a;
		}return fibo(a-1)+fibo(a-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		for(int i=0;i<z;i++) {
		System.out.print(fibo(i)+ " ");
		}
		
	}

}
/*//normal method 
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
			int x=0,y=1;
			System.out.print(x + " "+ y + " ");
			for(int i=2;i<z;i++) {
				int next=x+y;
				x=y;
				y=next;
				System.out.print(next+" ");
			}
			
 */