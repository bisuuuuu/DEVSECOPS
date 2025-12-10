package arrayrevise;
import java.util.*;
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {2,1,3,3,1,4,5};		
HashSet<Integer> set=new HashSet<>();
for(int i=0;i<arr.length;i++) {
	set.add(arr[i]);
}
System.out.println(set);

	}

}
