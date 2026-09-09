class Solution {
    public int maxFrequency(int[] nums, int k) {
        int result = 0;
        int l = 0;
        int r = 0;
        Arrays.sort(nums);
        long sum = 0;
        for(r = 0; r < nums.length; r++){
            sum += nums[r];

            while((long) nums[r] * (r - l + 1) - sum > k ){
                sum -= nums[l];
                l++;
            }

            result = Math.max(result,r - l + 1);
        }
        return result;

    }
}