//only on sorted array
public class BINARY_SEARCH {
public static void bs(int[]arr,int target) {
	int l=0;
	int r=arr.length-1;
	
	while(l<=r) {
		int mid=(l+r)/2;
		if(arr[mid]==target) {
			System.out.println("found");
			return;
		}if(arr[mid]<target) {
			l=mid+1;
		}else {
			r=mid-1;
		}
	}
	System.out.println("not found");
}
	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4};
		int target=7;
		bs(arr,target);

	}

}
