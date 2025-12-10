package array;
import java.util.*;
public class two_d_array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
int[][] arr2d = new int[3][2];
for(int row=0; row<arr2d.length;row++) {
	for(int col=0;col<arr2d[row].length;col++) {
arr2d[row][col]= in.nextInt();
System.out.print(arr2d[row][col] + " ");
}
	System.out.println(" ");
	}

}
	}
