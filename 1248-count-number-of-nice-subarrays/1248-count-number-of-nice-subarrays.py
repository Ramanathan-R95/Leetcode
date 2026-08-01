class Solution(object):
    def numberOfSubarrays(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        oddCount = 0
        m = {}
        m[0] = 1
        result = 0
        for i in nums:
            if i % 2 == 1:
                oddCount += 1
            if oddCount - k in m:
                result += m[oddCount - k]
            if oddCount in m:
                m[oddCount] += 1
            else:
                m[oddCount] = 1
        return result
            
            

