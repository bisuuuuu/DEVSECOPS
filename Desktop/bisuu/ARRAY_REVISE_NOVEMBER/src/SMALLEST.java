//always use Integer.MIN_VALUE; Integer.MAX_VALUE;
public class SMALLEST {

	public static void main(String[] args) {
		
int smallest=Integer.MAX_VALUE;
int[] arr=new int[] {1,2,3,4,5,-1};
for(int i=0;i<arr.length;i++) {
	if(arr[i]<smallest) {
		smallest=arr[i];
	}
}
System.out.println(smallest);
	}

}
