class Solution {
    public boolean check(int[] nums, int maxSum , int k){
        int curSum = 0 ;
        for (int j : nums){
            if (curSum + j > maxSum ){
                k-=1;
                curSum = j;
            }
            else 
                curSum += j;
            if( k == 0 ) return false;  
        }
        return (k <= 0) ? false: true ; 
    }
    public int splitArray(int[] nums, int k) {
        int start  = 0;
        int end = 0;
        for(int i  : nums) {
            if( i  > start) start = i ;
            end += i;
        }
        int res = Integer.MAX_VALUE ;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(check(nums,mid,k)) {
                res = Math.min(res,mid);
                end = mid -1 ;
            }
            else 
                start = mid + 1 ;
        }
        return res;


        
    }
}