//REMOVEDUPLICATE : USE HASHSET
import java.util.Arrays;
import java.util.HashSet;
public class REMOVEDUPLICATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {1,2,3,4,4,5,5,5,5,5,5,5,3,5243,5,245,425,435,43,53};
HashSet<Integer> set=new HashSet<>();
for(int i=0;i<arr.length;i++) {
	set.add(arr[i]);
}
System.out.println(set);
	}

}
