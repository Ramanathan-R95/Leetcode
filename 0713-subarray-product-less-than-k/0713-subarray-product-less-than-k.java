class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int r=0;
        int l=0;
        int count =0;
        int curProd=1;
        for(r=0 ; r < nums.length ; r++){
            curProd*=nums[r];
            while(l<r && curProd >= k){
                curProd/=nums[l];
                l++;
            }
            if(curProd < k)
             count+=(r-l+1);

        }
        return count;
        
    }
}