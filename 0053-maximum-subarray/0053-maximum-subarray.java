class Solution {
    
    
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int sum=maxSum;
        for(int i=0;i<nums.length;i++){
            if(sum==Integer.MIN_VALUE)
                sum=nums[i];
            else
                sum=sum+nums[i];
            if(maxSum < sum)
                maxSum=sum;
           // sum+=nums[j];
            if(sum<0)
                sum=0;
        }
        return maxSum;
    }    









            
            
            
            
            
            
        
        

        
            




            
        }



        

    
