class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int result=0;
        int l=0;
        int r=0;
        for(r=0 ; r<nums.length ; r++){
            if(nums[r]==1){
                result=Math.max(result,r-l+1);

            }
            else{
                l=r+1;
            }
        }
        return result;
    }
}