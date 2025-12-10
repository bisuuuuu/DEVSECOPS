package array;

public class min_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= new int[] {1,2,3,4,7,0};
System.out.println(min(arr));
	}
static int min(int[] arr) {
	int min = arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<min) {
			min =arr[i];
		}
	}
	return min;
}
}
