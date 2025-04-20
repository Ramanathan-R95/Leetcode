class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int j:nums){
            res=res^j;
        }
        return res;
    }
}