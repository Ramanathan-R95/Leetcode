class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        minSum = float("inf")
        for i in range(l,r+1):
            curSum = sum(nums[:i])
            if curSum > 0:
                minSum = min(minSum,curSum)
            for j in range(i,len(nums)):
                curSum +=nums[j] - nums[j-i]
                if curSum > 0:
                    minSum = min(minSum,curSum)
        if minSum == float("inf"): return -1
        return minSum



        