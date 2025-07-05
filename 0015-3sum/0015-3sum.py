class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        l=[]
        for i in range(len(nums)):
            if i > 0 and nums[i]==nums[i-1]:
                continue 

            j=i+1
            k=len(nums)-1
            while j < k:

                c=nums[i] + nums[j] + nums[k]
                if c==0:
                    l.append([nums[i] , nums[j] , nums[k]])
                    j+=1
                    while  nums[j]==nums[j-1] and j< k:
                        j+=1
                    
                elif c > 0:
                    k-=1
                else :
                    j+=1
        return l


        