package array;
import java.util.Arrays;
public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr = new int[] {1,2,3,4,5};
	reverse_array(arr);
	System.out.println(Arrays.toString(arr));
	}
 static void reverse_array(int[] arr) {
	int start=0;
	int end =arr.length-1;
	while(start<end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	
}
}
















/*int a =2;
for(int i =0 ;i<5;i++) {
System.out.println(i);
if (i == a) {
	break;
}
}*/
