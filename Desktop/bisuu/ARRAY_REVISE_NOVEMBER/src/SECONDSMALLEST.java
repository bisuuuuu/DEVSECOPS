//always use Integer.MIN_VALUE; Integer.MAX_VALUE;
public class SECONDSMALLEST {

	public static void main(String[] args) {
		
int smallest=Integer.MAX_VALUE;
int secondsmallest=Integer.MAX_VALUE;
int[] arr=new int[] {1,2,3,4,5};
for(int i=0;i<arr.length;i++) {
	if(arr[i]<smallest) {
		secondsmallest=smallest;
		smallest=arr[i];
	}else if(arr[i]<secondsmallest && arr[i]!=smallest) {
		secondsmallest=arr[i];
	}
}
System.out.println(smallest);
System.out.println(secondsmallest);
	}

}
