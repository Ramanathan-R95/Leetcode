class Solution(object):
    def maxSlidingWindow(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        result =[]
        q=[]
        
        for r in range(len(nums)):
            while q and nums[r] > q[-1][1]:
                q.pop()
            while q and r-q[0][0] +1 >k:
                q.pop(0)
            q.append((r,nums[r]))
            if r >=k-1:
                result.append(q[0][1])
        return result





        