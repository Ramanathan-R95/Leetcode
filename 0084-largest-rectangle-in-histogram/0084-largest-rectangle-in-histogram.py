class Solution(object):
    def largestRectangleArea(self, heights):
        """
        :type heights: List[int]
        :rtype: int
        """
        stack = [] 
        n = len(heights)
        result = 0
        for i in range(n):
            while stack and heights[i] <= heights[stack[-1]] :
                ind = stack.pop()
                nse = i
                pse = -1 if not stack else stack[-1]
                result = max(result , (nse - pse - 1)* heights[ind])
            stack.append(i)

        while stack :
            ind = stack.pop()
            pse = stack[-1] if stack else -1
            result = max(result,(n - pse - 1)* heights[ind])
        return result

