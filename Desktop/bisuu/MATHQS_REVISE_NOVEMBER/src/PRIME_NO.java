import java.util.*;
public class PRIME_NO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		boolean isPrime=true;
		if(x<=1) {
			isPrime=false;
		}else {
			for(int i=2;i<Math.sqrt(x);i++) {
				if(x%i==0) {
					isPrime=false;
					break;
				}
			}
		}
	if(isPrime) {
		System.out.println(x+ " prime no");
	}else {
		System.out.println(" not prime ");
	}
	}

}
