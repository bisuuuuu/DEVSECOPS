package arrayrevise;

public class linearsearch {
public static int linearsearch(int[] arr,int n) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==n) {
			return i;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,3,4,5};
int n=linearsearch(arr,6);
System.out.println(n);
	}

}
