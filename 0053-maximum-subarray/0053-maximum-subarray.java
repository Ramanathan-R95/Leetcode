class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum=nums[0];
        int l=0;
        int j;
        for(j=1; j<nums.length ;j++){
            
            while(l < nums.length && curSum <0){
                curSum-=nums[l];
                l++;
            }
            curSum+=nums[j];
            maxSum=Math.max(maxSum,curSum);

        }
        return maxSum;

        
    }
}