package arrayrevise;

public class maxconsequenceones {
public static int maxcount(int[] arr) {
	int count=0;
	int maxcount=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) {
			count++;
			if(count>maxcount) {
				maxcount=count;
			}
			}else {
				count=0;
		}
		
	}
	return maxcount;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,1,0,1,1,1};
int n=maxcount(arr);
System.out.println(n);
	}

}
