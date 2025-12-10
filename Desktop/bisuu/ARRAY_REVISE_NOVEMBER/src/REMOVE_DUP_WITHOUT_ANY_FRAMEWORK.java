import java.util.Arrays;
public class REMOVE_DUP_WITHOUT_ANY_FRAMEWORK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,2,2,3,3,4,5};
int count=1;
for(int i=0;i<arr.length-1;i++) {
	if(arr[i]!=arr[i+1]) {
		count++;
	}
}System.out.println(count);
int[]arr2=new int[count];
arr2[0]=arr[0];
int j=1;
for(int i=0;i<arr.length-1;i++) {
	if(arr[i]!=arr[i+1]) {
		arr2[j]=arr[i+1];
		j++;
	}
}
System.out.println(Arrays.toString(arr2));
	}

}
