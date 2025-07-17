class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=0;
        int n=nums.length;
        while(left < n && nums[left]!=0){
            left++;
            
        }
        right=left+1;
        while(right< n){
            if(nums[right]==0){
                right++;
            }
            else{
                int t=nums[left];
                nums[left]=nums[right];
                nums[right]=t;
                left++;
                right++;
            }

        }
        
    }
}