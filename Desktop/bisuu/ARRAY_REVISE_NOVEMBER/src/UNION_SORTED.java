import java.util.Arrays;//merge two arrays then use treeset to identify unique sorted arrays
import java.util.TreeSet;
public class UNION_SORTED {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {1,2,3};
int[]arr2=new int[] {2,3,4};
int[]arr3=new int[arr.length+arr2.length];
int c=0;
for(int i=0;i<arr.length;i++) {
	arr3[c]=arr[i];
	c++;
}
for(int j=0;j<arr2.length;j++) {
	arr3[c]=arr2[j];
	c++;
}
System.out.println(Arrays.toString(arr3));
TreeSet<Integer>set=new TreeSet<>();
for(int i=0;i<arr3.length;i++) {
	set.add(arr3[i]);
}System.out.println(set);
}

	}

