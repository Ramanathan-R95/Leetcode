class Solution:
    def calArea(self,nums):
        stack = []
        result = float("-inf")
        for i in range(len(nums)) :
            while stack and nums[i] <= nums[stack[-1]]:
                ind = stack.pop()
                pse = stack[-1] if stack else -1
                result = max(result,(i - pse - 1)*nums[ind])
            stack.append(i)
        while stack :
            ind = stack.pop()
            pse = stack[-1] if stack else -1
            result = max(result, (len(nums)-pse-1)*nums[ind])

        return result

    def maximalRectangle(self, matrix: List[List[str]]) -> int:
        nums = []
        n,m = len(matrix) , len(matrix[0])
        result = float("-inf")
        for i in range(n):
            if i == 0 :
                for j in matrix[0]:
                    nums.append(int(j))
            else :
                for j in range(m) :
                    if matrix[i][j]=='0':
                        nums[j] = 0
                    else :
                        nums[j]+=1
            result = max(result,self.calArea(nums))
        return result
            



        