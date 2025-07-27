class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result=Integer.MAX_VALUE;
        int l=0;
        int j;
        int curSum=0;
        for(j=0;j<nums.length;j++){
            curSum+=nums[j];
           // if(curSum >= target){
                
            while(l < nums.length && curSum>=target){
                result=Math.min(result,j-l+1);
            
                curSum-=nums[l];
                l++;
            }
            
        }
        if(result == Integer.MAX_VALUE) return 0;
        return result;
        
    }
}