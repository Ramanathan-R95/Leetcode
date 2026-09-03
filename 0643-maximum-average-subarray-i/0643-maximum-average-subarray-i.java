class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int curSum = 0;
        int l = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        curSum = sum;
        for(int r = k; r < nums.length; r++){
            curSum += nums[r];
            curSum -= nums[l];
            l++;
            sum = Math.max(sum,curSum);

        }
        return sum/(double)k;

        
    }
}