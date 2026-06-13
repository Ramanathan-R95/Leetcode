class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i] + temp;
            temp = result[i];
        }
        return result;
    }
}