
public class REVERSEUSINGSPLIT {
	 public static String reverseWords(String s) {
		 String[]words=s.split(" ");
		 int i=0;
		 int j=words.length-1;
		 while(i<j) {
				String temp=words[i];
				words[i]=words[j];
				words[j]=temp;
				i++;
				j--;
		 }
		 StringBuilder sb=new StringBuilder();
		 for(int k=0;k<words.length;k++) {
			 sb.append(words[k]);
			 if(k<words.length-1) {
				 sb.append(" ");
			 }
		 }
		 return sb.toString();
		 //return String.join(" ", words);
	 }
	public static void main(String[] args) {
		String s="i am biswa";
	System.out.println(reverseWords(s));;

	}

}
