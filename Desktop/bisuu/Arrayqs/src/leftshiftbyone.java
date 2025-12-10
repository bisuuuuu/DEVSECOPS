import java.util.Arrays;

public class leftshiftbyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,3,4,5};
left_shift(arr,5);
	}
public static void left_shift(int[] arr,int n) {
	int[] temp =new int[n];
	for(int i=1;i<n;i++) {
		temp[i-1]=arr[i];
	}
	temp[n-1]=arr[0];
	for(int i=0;i<n;i++) {
	System.out.print(temp[i] + " ");
}
	}
}
