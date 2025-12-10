
public class MINDIGITFROMSTRING {
public static int largest(String s) {
	int min=Integer.MAX_VALUE;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		int digit=ch-'0';
		if(digit<min) {
			min=digit;
		}
	}
	return min;
}
	public static void main(String[] args) {
		String s="123";
		System.out.println(largest(s));
	}

}
