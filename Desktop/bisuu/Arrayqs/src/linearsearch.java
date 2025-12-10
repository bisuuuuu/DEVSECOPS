
public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,3,4,5};
int k=4;
linear_search(arr,k);

	}
	public static void linear_search(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
			System.out.println("yes present "+arr[i]);
			return;
			}
			
		}
		System.out.println("no not here");;
	}

}
