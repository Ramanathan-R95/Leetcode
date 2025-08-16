class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        if len(nums) == 0 : return [-1,-1]
        start = 0
        end = len(nums) -1
        lb = len(nums)
        while start <= end:
            mid =(start + end) // 2
            if nums[mid] == target:
                lb = mid
                end = mid - 1
            elif nums[mid] > target :
                end = mid -1
            else :
                start = mid +1
        if lb == len(nums): return [-1,-1]
        start = 0
        end = len(nums) -1
        ub = end + 1
        while start <= end :
            mid = (start + end) // 2
            if nums[mid] > target :
                ub = mid
                end = mid -1
            else:
                start = mid +1
        return [lb,ub-1]
        