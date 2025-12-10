package array;
import java.util.Arrays;
public class max_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = new int[] {1,12,14,10,15};
System.out.println(max(arr));

	}
	
	static int max(int[] arr) {
		int max_value = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max_value) {
			max_value = arr[i];
		}
		}
		return max_value;
	}

}
