//REMOVEDUPLICATE : USE HASHSET
import java.util.Arrays;
import java.util.LinkedHashSet;
public class REMOVE_DUPLICATE_SORTED_LINKEDHASHSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {1,2,3,5,5,5,5,5,5,5,4,4,3,5243,5,245,425,435,43,53};
LinkedHashSet<Integer> set=new LinkedHashSet<>();
for(int i=0;i<arr.length;i++) {
	set.add(arr[i]);
}
System.out.println(set);
	}

}
