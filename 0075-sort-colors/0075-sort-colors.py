class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        i,j,k=(0,0,len(nums)-1)
        while (j <= k):
            if nums[j]==0:
                nums[j],nums[i]=nums[i],nums[j]
                j+=1
                i+=1
            elif nums[j]==2:
                nums[k],nums[j]=nums[j],nums[k]
                k-=1
                
            else:
                j+=1


        