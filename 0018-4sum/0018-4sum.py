class Solution(object):
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        n=len(nums)
        nums.sort()
        result=[]
        for i in range(n):
            if i > 0 and nums[i-1] == nums[i] : continue
            for j in range(i+1,n):
                if j > i+1 and nums[j] == nums[j-1] : continue
                l=j+1
                r=n-1
                while l < r:
                    curSum = nums[i] + nums[j] + nums[l] + nums[r]
                    if curSum == target:
                        result.append([nums[i],nums[j],nums[l],nums[r]])
                        l+=1
                        r-=1
                        while l < n and nums[l] == nums[l-1]:
                            l+=1
                        while r > 0 and nums[r] == nums[r+1]: r-=1
                    elif curSum > target :
                        r-=1
                    else :
                        l+=1
        return result


               
                
        
        