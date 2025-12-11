//flower flow flight =fl
public class LONGEST_COMMON_PREFIX {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0) {
			return "";
		}
	  String prefix=strs[0];
	  for(int i=1;i<strs.length;i++) {
		  while(!strs[i].startsWith(prefix)) {
			  prefix=prefix.substring(0,prefix.length()-1);
			  if(prefix.isEmpty()) {
				  return "";
			  }
		  }
	  }
	  return prefix;
	}
	public static void main(String[] args) {
		LONGEST_COMMON_PREFIX obj=new LONGEST_COMMON_PREFIX();
		String[]strs=new String[] {"flower","flow","flight"};
		System.out.println(obj.longestCommonPrefix(strs));;

	}

}
