import java.util.Arrays;
public class MOVE_ZERO_END_two_pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[] {1,0,2,0,3,0,4};
		int j=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j++;
	}
}System.out.println(Arrays.toString(arr));
	}

}
