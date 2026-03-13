class Solution {
    public int trap(int[] height) {
        int n = height.length ;
        int left = 0 , right = n -1 ;
        int leftMax = height[left] ;
        int rightMax = height[right] ;
        int result = 0 ;
        while(left < right){
            if(height[left] <= height[right]){
                if(height[left] > leftMax) leftMax = height[left] ;
                result += leftMax - height[left] ;
                left++ ;

            }
            else {
                if(height[right] > rightMax ) rightMax = height[right] ;
                result += rightMax - height[right] ;
                right-- ;
            }
        }
        return result ;
        
    }
}