class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        l = len(nums) 
        result = [-1] * l 
        stack = []
        for i in range( l -1 , -1 , -1) :
            while stack and nums[i] >= stack[-1] :
                stack.pop()
            stack.append(nums[i])
        for i in range(l - 1 , -1 ,-1 ) :
            while(stack and nums[i] >= stack[-1]) :
                stack.pop()
            if stack :
                result[i] = stack[-1]
            stack.append(nums[i]) 
        return result 

        