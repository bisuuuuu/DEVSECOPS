
public class COUNTDIGIT {
public static int digit(int a) {
	int count=0;
	while(a>0) {
		a=a/10;
		count++;
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12345;
System.out.println(digit(a));
	}

}
