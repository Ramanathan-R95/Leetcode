class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int temp=nums[0];
        for(int j=1;j<nums.length;j++){
             
            if(temp==nums[j])
                c++;
            else
                c--;
            
            if(c==0)
                {temp=nums[j];
                c=1;}

        }
        return temp;
    }
}
