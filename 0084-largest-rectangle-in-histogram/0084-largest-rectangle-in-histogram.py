class Solution(object):
        










    def largestRectangleArea(self, heights):
        """
        :type heights: List[int]
        :rtype: int
        """
        n =len(heights)
        pse = [-1] * n
        nse = [n] * n 
        stack = []
        for i in range(len(heights)) :
            while stack and heights[i] <= heights[stack[-1]] :
                nse[stack[-1]] = i 
                stack.pop()

            if stack :
                pse[i] = stack[-1]
            
            stack.append(i)





        result = 0
        for i in range(len(heights)) :
            result =max(result , ((nse[i] - pse[i]) -1) * heights[i])
        return result
        