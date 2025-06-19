class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        maxAvg=0
        for j in range(k):
            maxAvg+=nums[j]
        
        r=k
        sum1=maxAvg
        while r < len(nums):

            
            sum1=sum1-nums[r-k]+nums[r]
            if sum1 > maxAvg:
                maxAvg=sum1
            r+=1
            
        return maxAvg/float(k)


        