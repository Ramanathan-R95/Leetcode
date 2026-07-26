class Solution {
    public int helper(int[] nums,int goal){
        if(goal < 0) return 0;
        int result = 0;
        int l = 0;
        int curSum = 0;
        for(int r = 0; r < nums.length; r++){
            curSum += nums[r];
            while(curSum > goal){
                curSum -= nums[l];
                l++;
            }
            result += (r - l + 1);
        }
        return result;



    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal) - helper(nums,goal - 1);
        
    }
}