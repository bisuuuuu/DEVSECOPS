
public class CHECKSORTED {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {1,2,4,6,5,6};
boolean sorted=true;
for(int i=0;i<arr.length-1;i++) {
	if(arr[i+1]<arr[i]) {
		sorted=false;
		break;
	}
	}if(sorted) {
		System.out.println("sorted");
	}else {
		System.out.println("not sorted");
	}
}
	}


