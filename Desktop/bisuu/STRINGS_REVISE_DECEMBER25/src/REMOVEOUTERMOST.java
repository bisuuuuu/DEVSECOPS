
public class REMOVEOUTERMOST {
	public static String removeOuterParentheses(String s) {
		StringBuilder res=new StringBuilder();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='(') {
				if(count>0) {
				res.append(ch);
				}count++;
			}else if(ch==')') {
				count--;
				if(count>0) {
					res.append(ch);
				}
			}
		}
		return res.toString();
	}
	public static void main(String[] args) {
		String s="(()())(())";
		System.out.println(removeOuterParentheses(s));
	}

}
