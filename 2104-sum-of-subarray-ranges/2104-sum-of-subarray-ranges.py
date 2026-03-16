class Solution:
    def subArrayRanges(self, nums: List[int]) -> int:
        n = len(nums) 
        sum = 0
        for i in range(n) :
            minVal = nums[i]
            maxVal = nums[i]
            for j in range(i,n) :
                minVal = min(minVal,nums[j]) 
                maxVal = max(maxVal,nums[j])
                sum += maxVal - minVal
                
                
        return sum 

        