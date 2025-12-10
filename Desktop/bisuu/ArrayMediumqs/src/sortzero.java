import java.util.Arrays;

public class sortzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {0,1,2,0,1,2};
count(arr);
System.out.println(Arrays.toString(arr));
	}
public static void count(int[] arr) {
	int z=0;
	int count0=0;
	int count1=0;
	int count2=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==0) {
			count0++;
		}else if(arr[i]==1) {
			count1++;
		}else{
			count2++;
		}
	}
	for(int i=0;i<count0;i++) {
		arr[z]=0;
		z++;
	}for(int i=0;i<count1;i++) {
		arr[z]=1;
		z++;
	}for(int i=0;i<count2;i++) {
		arr[z]=2;
		z++;
	}
	
}
}
