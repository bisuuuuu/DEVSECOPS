import java.util.Arrays;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {5,4,3,2,1};
secondlargest(arr);
System.out.println(Arrays.toString(arr));

	}
	public static void secondlargest(int[] arr) {
		int largest= Integer.MIN_VALUE;
		int secondlargest= Integer.MIN_VALUE;		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest && arr[i]!=largest) {
				secondlargest=arr[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(secondlargest);
	}
}













/*first sort then directly    int[] arr=new int[] {5,4,3,2,1};
largest_ele(arr);
System.out.println(Arrays.toString(arr));
System.out.println(arr[1]+" second smallest here it is ");
System.out.println(arr[3]+" second largest here it is ");
	}
	
public static void largest_ele(int[] arr) {
	for(int i=0;i<arr.length-1;i++) {
		int min=i;
		for(int j=i+1;j<arr.length;j++) {
		if(arr[j]<arr[min]) {
			min=j;
		}
	}
	if(min!=i) {
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	
	}*/