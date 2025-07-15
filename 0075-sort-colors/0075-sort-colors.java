class Solution {
    public void sortColors(int[] nums) {
        int zeroCount=0;
        int oneCount=0;
        int n=nums.length;
        for(int i:nums){
            if (i==0)
                zeroCount++;
            else if(i==1)
                oneCount++;
            
        }
        for( int j=0;j< n ; j++){
            if ( j < zeroCount)
                nums[j]=0;
            else if ( j < zeroCount + oneCount)
                nums[j]=1;
            else
                nums[j]=2;

        }
        
        
    }
}