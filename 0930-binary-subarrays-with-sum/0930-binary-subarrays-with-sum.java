class Solution {
    public int helper(int[] num, int goal){
        int result = 0;
        int cur = 0;
        int l = 0;
        for(int r = 0; r < num.length; r++){
            cur += num[r];
            while(l <= r && cur > goal){
                cur -= num[l];
                l++;
            }
            if(l <= r )result += (r - l + 1);
            
        }
        return result;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal) - helper(nums,goal - 1);
        
    }
}