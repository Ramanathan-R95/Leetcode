class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid =(start + end) / 2 ;
            if(nums[mid] < min) min = nums[mid] ;
            if(nums[start] <= nums[mid]){
                min = Math.min(min,nums[start]);
                start = mid +1;
            }
            else end = mid -1;
        }
        return min;
        
    }
}