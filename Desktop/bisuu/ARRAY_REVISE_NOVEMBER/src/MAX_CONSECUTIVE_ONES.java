//Input: nums = [1,1,0,1,1,1]
//Output: 3
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            count++;
            max=Math.max(max,count);
        }else{
            count=0;
        }
        }
        return max;
        	}
        }
      
 
