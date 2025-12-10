
public class MISSING_NO_IN_ARRAY {
public static boolean missing(int[]arr,int miss) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==miss) {
			return true;
		}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {1,2,3,4,5};
System.out.println(missing(arr,8));
	}

}
