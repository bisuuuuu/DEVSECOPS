import java.util.Arrays;
public class MERGESORT {
	public static void mergesort(int[]arr,int left ,int right) {
		
		if(left>=right) {
			return;
		}int mid=(left+right)/2;
		mergesort(arr,left,mid);
		mergesort(arr,mid+1,right);
		merge(arr,left,mid,right);
	}
	public static void merge(int[]arr,int left ,int mid,int right) {
		int[]temp=new int[right - left + 1];
		 int i=left;
		 int j=mid+1;
		 int  k=0;
		 while(i<=mid && j<=right ) {
			 if(arr[i]<arr[j]) {
				 temp[k]=arr[i];
				 k++;
				 i++;
			 }else {
				 temp[k]=arr[j];
				 k++;
				 j++;
			 }while(i<=mid) {
				 temp[k]=arr[i];
				 i++;
				 k++;
			 }while(j<=right) {
				 temp[k]=arr[j];
				 j++;
				 k++;
		 }
			 }
		 System.arraycopy(temp,0,arr,left,temp.length);
		 
	}
public static void main(String[] args) {
		int[]arr=new int[] {2,1,4,3};
mergesort(arr,0 ,arr.length-1);
System.out.println(Arrays.toString(arr));
	}

}
