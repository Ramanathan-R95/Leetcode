class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int maxLeft=height[0],maxRight=height[r];
        int res=0;
        int j=0;
        for(;j<height.length;j++){
            
            res+=Math.min(maxLeft,maxRight)-height[j];
            if (height[l] < height[r])
                l++;
            else
                r--;
            if (l > r) break;
            maxLeft=Math.max(maxLeft,height[l]);
            maxRight=Math.max(maxRight,height[r]);
            
            


        }
        return res;
    }
}