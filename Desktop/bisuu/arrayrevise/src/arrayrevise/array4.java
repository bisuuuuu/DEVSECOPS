package arrayrevise;

import java.util.Arrays;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,3,4,5};
int s=1;
int n=arr.length;                                                            
int[] temp=new int[n];
for(int i=0;i<n;i++) {
	temp[i]=arr[(i+s)%n];
}
System.out.println(Arrays.toString(temp));
	}

}
