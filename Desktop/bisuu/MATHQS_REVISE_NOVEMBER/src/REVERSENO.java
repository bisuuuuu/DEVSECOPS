
public class REVERSENO {
public static int reverse(int a) {
	int rev=0;
	while(a>0) {
		int digit=a%10;//extract last digit
		rev=rev*10+digit; //*10 to make it count first 5 then 50+4=54 ...
		a=a/10;//remove last digit
	}
	return rev;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =12345;
System.out.println(reverse(a));
	}

}
