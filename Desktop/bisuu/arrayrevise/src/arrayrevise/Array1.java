package arrayrevise;
import java.util.*;
import java.util.Arrays;

public class Array1 {
public static boolean sorted(int[] arr,int n) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				return false;
			}
		}
		
	}
	return true;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{1,2,2,4};
		boolean n=sorted(arr,4);
		System.out.println(n);
	}

}














/*largest second largest 
int[] arr=new int[] {1,2,3,4};
int max=Integer.MIN_VALUE;
int maxi=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		maxi=max;
		max=arr[i];
	}
	else if(arr[i]>maxi && arr[i]!=max){
		maxi=arr[i];
	}
}
System.out.println(max);
System.out.println(maxi);*/



/*second smallest and first
int[] arr=new int[] {1,2,3,4};
int min=Integer.MAX_VALUE;
int mini=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++) {
	if(arr[i]<min) {
		mini=min;
		min=arr[i];
	}
	else if(arr[i]<mini && arr[i]!=min){
		mini=arr[i];
	}
}
System.out.println(min);
System.out.println(mini);*/





/*largest element
 * int[] arr=new int[]{12,1,31,4};
int max = arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}
}
System.out.println(max);*/











/*Move zeroes
 * int[]arr=new int[] {0,2,0,3,4};
int j=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j++;
	}
}
System.out.println(Arrays.toString(arr));?
*/















/* two sum
int[] arr=new int[]{1,2,3,4,5};
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]+arr[j]==5) {
			System.out.println(arr[i]+" "+arr[j]);
		}
	}
}*/