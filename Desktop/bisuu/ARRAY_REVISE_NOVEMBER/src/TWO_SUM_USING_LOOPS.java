
public class TWO_SUM_USING_LOOPS {

	public static void main(String[] args) {
		int[]arr=new int[] {1, 2, 4, 7, 11, 15};
		int target=12;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
			if(arr[i]+arr[j]==target) {
				System.out.println("found");
				return;
			}
			}
		}
		System.out.println("not found");

	}

}
