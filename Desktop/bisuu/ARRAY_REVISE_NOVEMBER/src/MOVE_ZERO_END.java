//input:1,0,2,0,3,0,4,0
//output: 1,2,3,4,0,0,0,0
import java.util.Arrays;
public class MOVE_ZERO_END {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[] {1,0,2,0,3,0,4,0};
		int[]arr2=new int[arr.length];
		int count=0;
for(int i=0;i<arr.length;i++) {
if(arr[i]!=0) {
	System.out.print(arr[i]+" ");
	arr2[count]=arr[i];
	count++;
}	    
}
System.out.println(" ");
System.out.println(Arrays.toString(arr2));

	}

}
