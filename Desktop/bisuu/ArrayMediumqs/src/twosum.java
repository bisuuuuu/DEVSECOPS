
public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[] {1,2,3,4,5};
		int target=3;
		twosum(arr,target);

	}
public static void twosum(int[] arr,int target) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==target) {
				System.out.println(" the digits are "+ arr[i] +" "+"and "+ arr[j]);
			} 
		}
		
	}
}
}
