
public class LINEAR_SEARCH {
public static boolean ls(int[]arr,int target) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			return true;
		}
	}
	return false;
}
	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4};
		int target=5;
		System.out.println(ls(arr,target));
	}

}
/*2nd method
 
public class LINEAR_SEACH {
public static void ls(int[]arr,int target) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			System.out.println(i);
			return;
		}
	}
	
}
	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4};
		int target=3;
		ls(arr,target);
	}

}

 */
