
public class rearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {1,-1,2,-2};
rearrange(arr);
	}
public static void rearrange(int[] arr) {
	int[] temp=new int[arr.length];
	int m=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			temp[m]=arr[i];
			m++;
		}else if(arr[i]<0) {
			temp[m]=arr[i];
			m++;
		}
	}
	for(int i=0;i<m;i++) {
	    System.out.print(temp[i] + " ");
	}

}
}
