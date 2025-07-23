class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        totalSum = sum(nums)
        prefixSum = 0
        for i in range(len(nums)):
            if prefixSum == totalSum - prefixSum - nums[i]:
                return i
            prefixSum += nums[i]
        return -1        