//using sliding window

public class subarraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,1,1,1,3,2};
int k=longestSubarray(arr,5);
System.out.println(k);
	}
	 public static int longestSubarray(int[]arr, int k) {
		 int sum=0;
		 int start=0;
		 int maxlen=0;
		 for(int end=0;end<arr.length;end++) {
			 sum=sum+arr[end];
			 while(sum>k) {
				 sum-=arr[start];
				 start++;
			 }
			 if(sum==k) {
				 int len=end-start+1;
				 if(len>maxlen) {
					 maxlen=len;
				 }
			 }
		 }
		 for(int i=0;i<maxlen;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println(" ");
		 return maxlen;
	 }
}
