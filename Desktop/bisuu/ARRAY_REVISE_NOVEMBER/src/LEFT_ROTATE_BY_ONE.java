//Input: nums = [1, 2, 3, 4, 5]  
//Output: [2, 3, 4, 5, 1]   // left shift means  arr2[i-1]=arr[i];
import java.util.Arrays;
public class LEFT_ROTATE_BY_ONE {
public static void lshift(int[]arr) {
	int[]arr2=new int[arr.length];
	arr2[arr2.length-1]=arr[0];
	for(int i=1;i<arr.length;i++) {
		arr2[i-1]=arr[i];
	}System.out.println(Arrays.toString(arr2));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {1, 2, 3, 4, 5};
lshift(arr);

	}

}
