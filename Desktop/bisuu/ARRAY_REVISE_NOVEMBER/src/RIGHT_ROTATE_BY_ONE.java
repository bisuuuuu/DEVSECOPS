//Input: nums = [1, 2, 3, 4, 5]  
//Output: [5, 1, 2, 3, 4]   // right shift means  arr2[i]=arr[i-1];
import java.util.Arrays;
public class RIGHT_ROTATE_BY_ONE {
public static void rshift(int[]arr) {
	int[]arr2=new int[arr.length];
	arr2[0]=arr[arr.length-1];
	for(int i=1;i<arr.length;i++) {
		arr2[i]=arr[i-1];
	}System.out.println(Arrays.toString(arr2));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {1, 2, 3, 4, 5};
rshift(arr);

	}

}
