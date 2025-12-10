import java.util.Arrays;
public class zerostoright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,0,2,0,3,0};
zeroes(arr);
System.out.println(Arrays.toString(arr));
	}
	public static void zeroes(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		}
	while(j<arr.length) {
		arr[j]=0;
		j++;
	}	
	}
}
