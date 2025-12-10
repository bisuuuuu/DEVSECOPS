package arrayrevise;import java.util.Arrays;

public class longestsubarray {
public static int sliding(int[] arr,int k) {
	int left=0;
	int sum=0;
	int maxlen=0;
	for(int right=0;right<arr.length;right++) {
		sum+=arr[right];
		while(sum>k && left<=right) {
			sum-=arr[left];
			left++;
		}if(sum==k) {
			maxlen=Math.max(maxlen, right-left+1);
			
		}
	}
	return maxlen;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {2,3,5};
int n=sliding(arr,5);
System.out.println(n);
	}

}
