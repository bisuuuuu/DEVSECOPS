import java.util.*;
public class q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String m=sc.nextLine();
		int a=12;
		String res=s+m+a;
//s*a 12 times print name biswa		
		System.out.println(res);
for(int i=0;i<a;i++) {
	System.out.println(res);
}
String q="bisu";
String w="bisu";
String r=new String("bisu");
System.out.println(q==w);//t
System.out.println(q==r);//f
System.out.println(w==r);//f
System.out.println(q.equals(r));//t
	}

}
