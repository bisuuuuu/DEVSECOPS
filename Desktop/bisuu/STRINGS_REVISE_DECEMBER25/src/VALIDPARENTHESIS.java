
public class VALIDPARENTHESIS {
public static boolean isvalid(String s) {
	int balance=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
	if(ch=='(') {
		balance++;
	}else if(ch==')') {
		balance--;
		if(balance < 0) return false;
	}
	}
	return balance==0;
}
	public static void main(String[] args) {
		String s="((())";
		System.out.println(isvalid(s));;
	}

}
