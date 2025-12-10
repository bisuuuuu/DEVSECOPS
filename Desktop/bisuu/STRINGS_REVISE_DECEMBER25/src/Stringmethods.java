
public class Stringmethods {

	public static void main(String[] args) {
		String s="biSWa";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	System.out.println(s.trim());//dlt spaces "  bisu  "-> returns "bisu"
		System.out.println(s.startsWith("b"));
		System.out.println(s.startsWith("a"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.endsWith("i"));
		//charAt()//gives location retrun values
		System.out.println(s.charAt(0));
		//valueOf
		int i=12;//use valueOf to change int to string
		String n=String.valueOf(i);
		System.out.println(i+2);
		System.out.println(n+2);
		System.out.println(s.contains("bi"));
		System.out.println(s.replace("bi","ro")); //replace 
		System.out.println(s.isEmpty());
		
		
		//SUBSTRING
		
		String l="This is java lang";
		String o=l.substring(1,4);//1 to 3 not 4
		//String o=l.substring(1);//1 to last
		System.out.println(o);
		
		//split
		String word="this is java,And not cpp lang";
		String[]newSplit=word.split(" ");
		for(int p=0;p<newSplit.length;p++) {
			System.out.println(newSplit[p]);
			
		}//for each
	//	for(String h:newSplit) {
//System.out.print(h);
		//String.toCharArray()
				String j="biswa is";
				char[]y=j.toCharArray();
				for(int z=0;z<y.length;z++) {
					System.out.println(y[z]);
				}//for(char c:y) {
					//System.out.println(c);
				//}
	}

}
