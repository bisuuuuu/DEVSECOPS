//input 0123456 -> remove front 0 and check from last
//largest odd no check from back
public class LARGESTODDNOINSTRING {
public static String odd(String s) {
	int lastindex=-1;
for(int i=s.length()-1;i>=0;i--) {
	char ch=s.charAt(i);
	if(ch=='1'||ch=='3'||ch=='5'||ch=='7'||ch=='9') {
	lastindex=i;
	break;
	}
}
	String res=s.substring(0,lastindex+1);
	int st=0;
	while(st<res.length() && res.charAt(st)=='0') {
		st++;
	}
	return res.substring(st);
}
	public static void main(String[] args) {
	String s="0123456";
System.out.println(odd(s));
	}

}
