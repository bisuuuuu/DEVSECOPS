//always use Integer.MIN_VALUE; Integer.MAX_VALUE;
import java.util.Arrays;
public class SECONDLARGEST {
public static int largest(int[]arr) {
	int largest=arr[0];
	int second=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
				second=largest;
				largest=arr[i];
		}else if(arr[i]>second && arr[i]!=largest) {
			second=arr[i];
		}
	}
	return second;
}
	public static void main(String[] args) {
		int[] arr=new int[] {3,2};
	System.out.println(Arrays.toString(arr));
	System.out.println(largest(arr));
	}

}
