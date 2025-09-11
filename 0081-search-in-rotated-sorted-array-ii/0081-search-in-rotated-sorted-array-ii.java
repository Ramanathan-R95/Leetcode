class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int m ;
        while (l <= r) {
            m = (l + r) / 2;
            if(nums[m] == target)
                return true;
            else if(nums[l] == target || nums[r] == target)
                return true;
            else{
                if(nums[l] == nums[m] && nums[m] == nums[r]){
                    l++;
                    r--;
                }
                else if(nums[l] <= nums[m]){
                    if(target > nums[l] && target < nums[m]) r = m-1;
                    else l = m + 1;
                }
                else {
                    if(target > nums[m] && target < nums[r]) l = m + 1;
                    else r = m - 1;
                }
            }

        }
        return false;
        
    }
}