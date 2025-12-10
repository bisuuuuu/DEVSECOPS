//Input: nums = [1, 2, 3, 4, 5]  
//Output: [2, 3, 4, 5, 1]// RIGHT shift by n means (i+n+arr.length)%arr.length;
import java.util.Arrays;
public class RIGHT_SHFIT_BY_K {
public static void lshift(int[]arr,int n) {
	int[]arr2=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		int newindex=(i+n+arr.length)%arr.length;
		arr2[newindex]=arr[i];
	}System.out.println(Arrays.toString(arr2));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {1, 2, 3, 4, 5};
lshift(arr,3);

	}

}
