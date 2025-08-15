class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] res = {-1,-1} ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target) {
                res[0]=i;
                break;
            }
        }
        if(res[0] == -1) return res;
        for(int i = res[0] ; i < nums.length ; i++){
            if(nums[i]==target) res[1]=i;
            else break;
        }
        return res;

        
        
    }
}