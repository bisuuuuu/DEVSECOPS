//arr=1,2,2,3,3
//o/p is  1 bcz appeared once //use xor bcz in xor 1^1=0 and 1^0=1
public class ONE_ELEMENT_ONCE_OTHER_TWICE {
public static int singleNumber(int[] nums) {
	int res=0;
        for(int i=0;i<nums.length;i++) {
        	res=res^nums[i];	
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
