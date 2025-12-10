import java.util.Arrays;
public class arraysorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {4,3,21,1};
boolean result=isSorted(arr,4);
System.out.println(Arrays.toString(arr));
System.out.println(result);
	}
public static boolean isSorted(int[] arr,int n) {
	for(int i=0;i<n-1;i++) {
	if(arr[i]>arr[i+1]) {
		return false;
}
}
return true;
	}
}
