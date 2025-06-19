class Solution(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        """
        length=float("inf")
        l=0
        r=0
        sum=0
        while r < len(nums):
            sum+=nums[r]
            if sum >= target:
                length=min(length,r-l+1)
            while sum >= target:
                sum-=nums[l]
                l+=1
                if sum>=target:
                    length=min(length,r-l+1)
            r+=1
        return 0 if length==float("inf") else length
        
           

        