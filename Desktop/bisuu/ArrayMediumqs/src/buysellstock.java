
public class buysellstock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {7,1,5,3,6,4};
buysell(arr);
	}
public static void buysell(int[] arr) {
	int pro=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				pro=Math.max(arr[j]-arr[i], pro);
			}
		}
	}
	System.out.println("The profit is "+pro);
	
}
}
