class Solution(object):
    def minimumSumSubarray(self, nums, l, r):
       
        minSum=float("inf")
       
        s=0
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                if j-i+1 < l or j-i+1 > r:
                    continue
                s=sum(nums[i:j+1])
                if s> 0 :
                    minSum =min(minSum,s)
       
        
        return -1 if minSum==float("inf") else minSum