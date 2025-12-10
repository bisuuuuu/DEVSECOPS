
public class missingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= new int[] {1,2,3,4,5,6,7,8,9};
int n=10;
int sum = n*(n+1)/2;
int sum2=0;
for(int i=0;i<n-1;i++) {
	sum2+=arr[i];
}
int result =sum-sum2;
System.out.println("missing num is "+ result );
	}

}
