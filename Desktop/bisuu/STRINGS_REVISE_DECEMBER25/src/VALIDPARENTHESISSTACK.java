import java.util.Stack;
public class VALIDPARENTHESISSTACK {
public static boolean ismatching(char open,char close) {
	if(open=='(' && close==')') {
		return true;
	}if(open=='{' && close=='}') {
		return true;
	}if(open=='[' && close==']') {
		return true;
	}
	return false;
}
public static boolean isvalid(String s) {
	Stack<Character> sta=new Stack<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='(' || ch=='{'|| ch=='[') {
			sta.push(ch);
		}else if(ch==')' || ch=='}'|| ch==']') {
			if(sta.isEmpty()) {
				return false;
				}
			char top=sta.pop();
			if(!ismatching(top,ch)){
				return false;
			}
		}
	}
	return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="({[]}})";
System.out.println(isvalid(s));
	}

}
