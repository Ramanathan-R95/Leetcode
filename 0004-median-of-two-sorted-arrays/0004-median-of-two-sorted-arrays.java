class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums = new int[nums1.length + nums2.length ];
        int l1=0;
        int l2=0;
        int k=0;
        while(l1 < nums1.length && l2 < nums2.length){
            if(nums1[l1] <= nums2[l2]){
                nums[k++] = nums1[l1++];
            }
            else nums[k++] = nums2[l2++];
        }
        while(l1<nums1.length){
            nums[k++]=nums1[l1++];
        }
        while(l2<nums2.length){
            nums[k++]=nums2[l2++];
        }
       // for(int j : nums) System.out.print(j);
        if(nums.length % 2 == 1) return nums[nums.length/2];
        l1 = nums.length/2;
        return (nums[l1] + nums[l1-1])/2.0;
        
    }
}