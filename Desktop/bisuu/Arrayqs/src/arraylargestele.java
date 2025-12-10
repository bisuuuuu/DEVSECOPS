import java.util.Arrays;

public class arraylargestele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,3,4,5};
int maxValue=largest_ele(arr);
System.out.println(Arrays.toString(arr));
System.out.println("largest element  is "+ maxValue);
	}
	
public static int largest_ele(int[] arr) {
	int max = 0;
	for(int j=0;j<arr.length-1;j++) {
		 max=arr[j];
		if(arr[j]<arr[j+1]) {
			max=arr[j+1];
		}
	}
	return max;
	
	
}
}
