class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        def subSum(low,high):
            if low < high:
                mid=(low+high)//2
                max1=subSum(low,mid)
                max2=subSum(mid+1,high)
                max3=nums[mid]
                s1=0
                for j in range(mid,low-1,-1):
                    s1+=nums[j]
                    max3=max(s1,max3)
                s1=0
                m3=nums[mid+1]
                for j in range(mid+1,high+1):
                    s1+=nums[j]
                    m3=max(s1,m3)
                max3+=m3
                return max(max1,max2,max3)
            elif high==low:
                return nums[low]
            
        return subSum(0,len(nums)-1)

