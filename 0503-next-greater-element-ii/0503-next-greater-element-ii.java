class Solution {
    public int nextGreat(int ind , int []nums){
        int res = -1 ;
        int l = nums.length ;
        int st =( ind + 1 )%l ;

        while( st != ind){
            if(nums[st] > nums[ind]){
                res = nums[st] ;
                break ;
            }
            st = (st + 1 ) % l ;

        }
        return res ;
    }
    public int[] nextGreaterElements(int[] nums) {
        int l = nums.length ;
        int[] result = new int[l] ;
        for(int i = 0 ; i < l ; i++){
            result[i] = nextGreat(i,nums) ;

        }
        return result ;
        
    }
}