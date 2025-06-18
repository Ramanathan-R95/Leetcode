class Solution {
    public int subSum(int []nums,int l,int h){
        if (l<h){
            int mid=(l+h)/2;
            int leftSum=subSum(nums,l,mid);
            int rightSum=subSum(nums,mid+1,h);
            int midCrossSum=Integer.MIN_VALUE;
            int temp=0;
            int t2=Integer.MIN_VALUE;

            for(int j=mid;j>=l;j--){
                temp=temp+nums[j];
                midCrossSum=Math.max(midCrossSum,temp);

            }
            temp=0;
            for(int j=mid+1;j<=h;j++){
                temp+=nums[j];
                t2=Math.max(t2,temp);

            }
            midCrossSum=midCrossSum+t2;
            return (leftSum > rightSum && leftSum >midCrossSum)? leftSum:(rightSum > midCrossSum)? rightSum: midCrossSum;
        }
        else if(h==l)
           return nums[l];
           
        else return 0;
        }
    
    public int maxSubArray(int[] nums) {
        return subSum(nums,0,nums.length-1);
        
    }
}