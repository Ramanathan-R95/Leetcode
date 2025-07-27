class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int j;
        int sum=0;
        int maxSum;
        for(j=0 ; j < k ; j++){
            sum+=nums[j];

        }
        maxSum=sum;
        for(j=k ; j <nums.length;j++ ){
            sum-=nums[l];
            sum+=nums[j];
            maxSum=Math.max(maxSum,sum);

            l++;

        }
        return maxSum/(double)k;
        
    }
}