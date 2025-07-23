class Solution {
    public int pivotIndex(int[] nums) {
        int pivot=-1;
        int[] arr=new int[nums.length];
        int pSum=0;
        for(int j=0;j<nums.length;j++){
            arr[j]=pSum;
            pSum+=nums[j];
        }
        //pSum+=nums[nums.length-1];
        for(int j=0;j<nums.length ;j++){
            if(pSum-nums[j]-arr[j]==arr[j]) return j;

        }
        return -1;
    }
}