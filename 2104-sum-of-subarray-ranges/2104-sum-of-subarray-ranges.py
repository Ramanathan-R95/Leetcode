class Solution(object):
    def cal_pse(self,nums) :
        stack =[]
        pse =[-1] * len(nums)
        for i in range(len(nums)):
            while stack and nums[i] <= nums[stack[-1]] : stack.pop()
            if stack : pse[i] = stack[-1]
            stack.append(i)
        return pse
    def cal_nse(self,nums) :
        nse = [len(nums)] * len(nums)
        stack = []
        for i in range(len(nums) - 1 , -1 , -1):
            while stack and nums[i] < nums[stack[-1]] :
                stack.pop()
            if stack : nse[i] = stack[-1]
            stack.append(i)
        return nse 

    def cal_pge(self,nums) :
        stack = []
        n = len(nums)
        pge =[-1] * n 

        for i in range(n) :
            while stack and nums[i] >= nums[stack[-1]] : stack.pop() 
            if stack :
                pge[i] = stack[-1]
            stack.append(i)
        return pge 
    

    def cal_nge(self,nums) :
        n = len(nums) 
        stack = [] 
        nge = [n] * n
        for i in range(n - 1 , -1 , -1):
            while stack and nums[i] > nums[stack[-1]] : stack.pop()
            if stack : nge[i] = stack[-1]
            stack.append(i) 
        return nge




    def subArrayRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nse = self.cal_nse(nums) 
        pse = self.cal_pse(nums) 
        nge = self.cal_nge(nums)
        pge = self.cal_pge(nums)
        sum_min = 0 
        sum_max = 0
        for i in range(len(nums)) :
            l = i - pse[i]
            r = nse[i] - i
            sum_min += l * r * nums[i]
        for i in range(len(nums)) :
            l = i - pge[i]
            r = nge[i] - i
            sum_max += l * r * nums[i]
        return sum_max - sum_min
        

        