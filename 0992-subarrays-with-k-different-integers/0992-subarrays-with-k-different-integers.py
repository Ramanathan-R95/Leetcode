class Solution:
    def helper(self, nums, k):
        l = 0
        result = 0
        freq = {}
        for r in range(len(nums)):
            ele = nums[r]
            freq[ele] = freq[ele] + 1 if ele in freq else 1
            while(len(freq) > k) :
                freq[nums[l]] -= 1
                if freq[nums[l]] == 0:
                    freq.pop(nums[l])
                l += 1
                
            result += r - l + 1
        return result

    def subarraysWithKDistinct(self, nums: List[int], k: int) -> int:
        return self.helper(nums, k) - self.helper(nums, k - 1)

        