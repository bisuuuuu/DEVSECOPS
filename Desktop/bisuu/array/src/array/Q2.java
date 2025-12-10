package array;
import java.util.Arrays;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5};
		System.out.println(Arrays.toString(num));
		change(num);
		System.out.print(Arrays.toString(num));

	}
	
	static void change(int[] arr) {
		arr[0]=99;
	}

}
