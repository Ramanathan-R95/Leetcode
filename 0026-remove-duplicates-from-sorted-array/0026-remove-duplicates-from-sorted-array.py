class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        duplicateCount=0
        n=len(nums)
        for i in range(1,n):
            if nums[i]==nums[i-1]:
                duplicateCount+=1
            else:
                nums[i-duplicateCount]=nums[i]
        return n-duplicateCount

        