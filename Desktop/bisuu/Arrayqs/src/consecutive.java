import java.util.Arrays;

public class consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= new int[] {1,1,1,0,1,1,0};
int k=findMaxConsecutiveOnes(arr);
System.out.println(k);
	}
	  public static int findMaxConsecutiveOnes(int[] arr) {
		  int count=0;
		  int count1=0;
	        for(int i=0;i<arr.length;i++) {
	        	if(arr[i]==1) {
	        		count++;
	        		count1=Math.max(count1, count);
	        	}else {
	        		count=0;
	        	}
	        }
	        return count1;
	    }
	}

