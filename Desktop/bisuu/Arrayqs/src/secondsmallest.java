import java.util.Arrays;
public class secondsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {5,4,3,2,1};
smallest(arr);
System.out.println(Arrays.toString(arr));
		
	}
	public static void smallest(int[] arr) {
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondsmallest=smallest;
				smallest=arr[i];
				
			}else if(arr[i]<secondsmallest && arr[i]!= smallest) {
				secondsmallest=arr[i];
			}
		}
		System.out.println(smallest);
		System.out.println(secondsmallest);
			
	}

}
