class Solution:
    def trap(self, height: List[int]) -> int:
        l , r = 0 , len(height) - 1
        total = 0
        leftMax , rightMax = height[l] , height[r] 
        while l <= r :
            if leftMax <= rightMax :
                leftMax = max(leftMax,height[l])
                total += leftMax - height[l] 
                l+=1
            else :
                rightMax = max(rightMax,height[r])
                total += rightMax - height[r] 
                r-=1
        return total

        