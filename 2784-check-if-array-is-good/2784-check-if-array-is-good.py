class Solution:
    def isGood(self, nums: List[int]) -> bool:
        s = set(nums)
        m = max(nums)
        for i in range(1,len(nums)):
            if i not in s:
                return False
        return True if nums.count(m) == 2 else False 
        