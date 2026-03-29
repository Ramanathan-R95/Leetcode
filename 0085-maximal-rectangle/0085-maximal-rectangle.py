class Solution(object):
    def calMaxArea(self,row, matrix) :
        n = len(matrix)
        m = len(matrix[0])

        nums = []
        for i in range(m):
            nums.append(int(matrix[0][i]))
        for i in range(1,row + 1) :
            for j in range(m) :
                if int(matrix[i][j]) != 0:
                    nums[j] += 1
                else :
                    nums[j] = 0
       




        stack = []
        result = float("-inf")
        for i in range(m):
            while stack and nums[i] <= nums[stack[-1]] :
                ind = stack.pop()
                pse = stack[-1] if stack else -1
                result = max(result,(i - pse - 1)* nums[ind])
            stack.append(i)
        while stack :
            ind = stack.pop()
            pse = stack[-1] if stack else -1
            result = max(result, (m-pse-1)*nums[ind])
        return result

    def maximalRectangle(self, matrix):
        """
        :type matrix: List[List[str]]
        :rtype: int
        """
        res = 0
        for i in range(len(matrix)):
            res = max(res,self.calMaxArea(i,matrix))
        return res