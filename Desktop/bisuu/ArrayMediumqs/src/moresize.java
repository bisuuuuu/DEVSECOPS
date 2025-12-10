
public class moresize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {2,2,2};
moresize(arr);
	}
public static void moresize(int[] arr) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
		 if(arr[i]==arr[j]) {
			 count++;
		 } 
	}
		if(count>arr.length/2) {
			System.out.println(arr[i]);
			return;
		}
	
	
}
}
}
