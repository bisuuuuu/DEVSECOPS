import java.util.Arrays;

public class arraysmallestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,3,4,5};
int minValue=smallest_ele(arr);
System.out.println(Arrays.toString(arr));
System.out.println("smallest element  is "+ minValue);
	}
	
public static int smallest_ele(int[] arr) {
	int min = arr[0];
	for(int j=1;j<arr.length;j++) {
		if(arr[j]<min) {
			arr[j]=min;
		}
	}
	return min;
	
	
}
}
