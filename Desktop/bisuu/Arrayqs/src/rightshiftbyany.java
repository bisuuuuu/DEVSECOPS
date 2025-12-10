import java.util.Arrays;
public class rightshiftbyany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,3,4,5,6,7};
rightshift(arr,4);
	}
public static void rightshift(int[] arr,int k) {
	int n=arr.length;
int[] temp=new int[n];
int m=0;
	for(int i=n-k;i<n;i++) {
		temp[m]=arr[i];
		m++;
	}
	for(int i=0;i<n-k;i++) {
		temp[m]=arr[i];
		m++;
	}
	for(int i=0;i<n;i++) {
		System.out.print(temp[i]+ " ");
	}
}
}
