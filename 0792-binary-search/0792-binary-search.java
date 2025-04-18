class Solution {
    public int search(int[] nums, int target) {
        int m;
        int s=0,e=nums.length-1;
        while(s<=e){
            m=s+(e-s)/2;
            if(nums[m]==target)
                return m;
            else if(nums[m]>target)
                e=m-1;
            else
                s=m+1;
            
        }
        return -1;
    }
}