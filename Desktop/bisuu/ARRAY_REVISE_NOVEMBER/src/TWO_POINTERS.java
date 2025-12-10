//two pointer given a sorted array find targeted sum
public class TWO_POINTERS {

	public static void main(String[] args) {
		int[]arr=new int[] {1, 2, 4, 7, 11, 15};
		int target=123;
		int i=0;
		int j=arr.length-1;
		while(i<j) {
		if(arr[i]+arr[j]>target) {
			j--;
		}else if(arr[i]+arr[j]<target) {
			i++;
		}else if(arr[i]+arr[j]==target) {
			System.out.println("found");
			return;
		}
		}
		System.out.println("not found");
	}

}
