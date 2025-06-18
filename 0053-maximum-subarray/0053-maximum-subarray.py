class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxSum=nums[0]
        sum=0
        for i in range(len(nums)):
            sum+=nums[i]
            if maxSum < sum:
                maxSum=sum
            
            if sum<0:
                sum=0
        return maxSum
        