package arrayrevise;

import java.util.Arrays;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {1,2,3,4,5};
int start=arr[0];
for(int i=0;i<arr.length-1;i++) {
	arr[i]=arr[i+1];
}
int lastindex=arr.length-1;
arr[lastindex]=start;
System.out.println(Arrays.toString(arr));
	}
	

}
