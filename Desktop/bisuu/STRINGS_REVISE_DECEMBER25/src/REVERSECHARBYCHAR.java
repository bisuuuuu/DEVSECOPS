
public class REVERSECHARBYCHAR {
	public static String reverse(String s) {
		char[]ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
	}String as=new String(ch);
	return as;
	}
	public static void main(String[] args) {
		String s="i am biswa";
		System.out.println(reverse(s));
		}
		
	}


