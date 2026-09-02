class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        result = 0 
        n = len(nums)
        l = 0
        for r in range(n):
            if nums[r] == 0:
                k -= 1
            while l < r and k <= -1:
                if nums[l] == 0:
                    k += 1
                l += 1
            if k >= 0 :
                result = max(result , r - l + 1)
        return result
        