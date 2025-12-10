
public class SLIDING_WINDOW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {10,5,2,7,1,9};
int k=15;
int left = 0,sum=0;
int maxlen=0;
for(int right=0;right<arr.length;right++) {
	sum+=arr[right];
	while(sum>k && left<=right) {
		sum=sum-arr[left];
		left++;
	}if(sum==k) {
		maxlen=right-left+1;
	}
}
System.out.println(maxlen);
	}

}
