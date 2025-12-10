import java.util.Arrays;//always use Integer.MIN_VALUE; Integer.MAX_VALUE;
public class LARGEST_ELEMENT_ARRRAY {
public static int largest(int[]arr) {
	int largest=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			largest=arr[i];
		}
	}
	return largest;
 
	
}
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6};
	//	for(int i=0;i<arr.length;i++) {
//	System.out.print(arr[i]);
	//	}
		
		System.out.println(Arrays.toString(arr));
	System.out.println("Largest one is  " + largest(arr));
	}

}
