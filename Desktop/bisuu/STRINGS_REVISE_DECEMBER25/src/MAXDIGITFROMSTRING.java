
public class MAXDIGITFROMSTRING {
public static int largest(String s) {
	int max=-1;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		int digit=ch-'0';
		if(digit>max) {
			max=digit;
		}
	}
	return max;
}
	public static void main(String[] args) {
		String s="123";
		System.out.println(largest(s));
	}

}
