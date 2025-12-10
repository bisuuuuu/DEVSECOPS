//for(int j=0;j<arr2.length;j++) { //USE THIS WHEN U WONT USE ARRAYS.TOSTRING
		//System.out.print(arr2[j]+" ");
import java.util.Arrays;
public class PRE_FIX_SUM {
	public static void main(String[] args) {
		int[]arr=new int[] {2,4,5,1,3};
		int[]arr2=new int[arr.length];
		System.out.print("prefix of this array "+Arrays.toString(arr)+" is ");
		arr2[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr2[i]=arr2[i-1]+arr[i];
		}
			System.out.print(Arrays.toString(arr2));
			System.out.println();
			System.out.print("Sum of array from index 1 to 3 is ");
			int l=1;// if l=0 then sum=12 
			int r=3;
			int sum;
			if(l==0) {
				sum=arr2[r];
			}else {
				sum=arr2[r]-arr2[l-1];
			}
			System.out.print(sum);
	}

		

}
