public class subarraynegative {
    public static void main(String[] args) {
   int[]arr=new int[] {-2,1,-3,4,-1,2,1,-5,4};
   int k=6;
   int maxlen = 0;
    for(int i=0;i<arr.length;i++) {
    	int sum=0;
    	for(int end=i;end<arr.length;end++) {
    		sum=sum+arr[end];
    		if(sum==k) {
    			int len=end-i+1;
    			if (len > maxlen) {
                    maxlen = len;
                }
    		}
    		}
    	
    	}
    System.out.println("length is "+maxlen);
    }
    }
    
