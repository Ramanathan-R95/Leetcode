class Solution {
    public int longestOnes(int[] nums, int p) {
        int result =0;
        int temp;
        int c;
        for(int j=0;j <nums.length; j++){
            temp=p;
            c=0;
            for(int k=j; k<nums.length ; k++){
                if(nums[k] == 1) c++;
                else if (temp > 0){
                    temp--;
                    c++;
                    
                } 
                else break;
            }
            result=Math.max(result,c);
        }
        return result;
        
    }
}