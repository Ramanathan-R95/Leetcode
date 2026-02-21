class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        h = {}
        res = [-1] * len(nums1)
        for i in range(len(nums2)):
            h[nums2[i]] = i 
        for i in range(len(nums1)) :
            st = h[nums1[i]]
            
            for j in range(st,len(nums2)) :
                if nums2[j] > nums1[i] :
                    res[i] = nums2[j]
                    break
        return res


           
        