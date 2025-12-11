
public class STRINGROTATION {
public static boolean stringrotate(String s,String goal) {
	//StringBuilder sb2=new StringBuilder(s);
	if(s.length()!=goal.length()) {
		return false;
	}
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		String sb=s.substring(i)+s.substring(0,i);
		
		if(sb.equals(goal)) {
			return true;
		
		}
	}
	return false;
}
	public static void main(String[] args) {
		String s="bisu";
		String goal="subi";
System.out.println(stringrotate(s,goal));
	}

}
