class Solution:
    def trap(self, height: List[int]) -> int:

        result = 0 

        n = len(height) 
        maxLeft = [] 
        maxRight = [0] * n 
        ml = height[0]
        mr = height[-1]
        for i in height :
            if i > ml :
                ml = i 
            maxLeft.append(ml)
        for i in range(n-1,-1,-1) :
            if height[i] > mr :
                mr = height[i]
            maxRight[i]=mr
        for i in range(n) :
            result += min(maxLeft[i],maxRight[i]) - height[i]
        return result 

        

        