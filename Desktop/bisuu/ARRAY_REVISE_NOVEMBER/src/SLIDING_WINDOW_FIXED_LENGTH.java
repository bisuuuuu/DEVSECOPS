import java.util.Arrays;
public class SLIDING_WINDOW_FIXED_LENGTH {
	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4,5};
		int k=3;//fixed length :3
		int sum=0;
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		int maxsum=sum; //maxsum=6 as per now
		int strt=0;
		for(int i=k;i<arr.length;i++) {
			sum=sum-arr[i-k]+arr[i];
			maxsum=Math.max(sum,maxsum);
			strt=i-k+1;
		}System.out.println(maxsum);
		
		for(int i=strt;i<strt+k;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
