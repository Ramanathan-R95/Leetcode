class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum=Integer.MAX_VALUE;
        int res=0;
        int n=nums.size();
        int j=0,i=0;
        for (j=l;j<=r;j++){
            int left=0;
            res=0;
            for(i=0;i<j;i++)    res=res+nums.get(i);
            if (res > 0)
                minSum=Math.min(minSum,res);
            for(i=j;i<n;i++){
                res=res+nums.get(i)-nums.get(left);
                left++;
                if (res > 0)
                minSum=Math.min(minSum,res);

            }
        }
        if(minSum==Integer.MAX_VALUE)
            return -1;
        return minSum;
    


        
    }
}