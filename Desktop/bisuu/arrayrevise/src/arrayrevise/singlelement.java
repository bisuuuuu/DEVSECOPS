package arrayrevise;

public class singlelement {
public static int singlelement(int[] arr) {
	int cnt=0;
	for(int i=0;i<arr.length;i++) {
		cnt^=arr[i];
	}
	return cnt;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {2,2,1};
int n=singlelement(arr);
System.out.println(n);
	}

}
