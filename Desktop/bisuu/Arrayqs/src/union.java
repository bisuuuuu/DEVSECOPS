import java.util.*;
public class union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,3,4,5};
int[] arr1=new int[] {4,5,6,7,8};
HashSet<Integer> set=new HashSet<>();
for(int i=0;i<arr.length;i++){
    set.add(arr[i]);
}
for(int i=0;i<arr1.length;i++){
    set.add(arr1[i]);
}
System.out.print(set);
	}

}
