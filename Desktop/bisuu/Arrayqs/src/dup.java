import java.util.HashSet;
public class dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,1,2,3,2,3,4,5};
HashSet<Integer> set=new HashSet<>();
for(int i=0;i<arr.length;i++){
    set.add(arr[i]);
}
System.out.print(set);
	}

}
