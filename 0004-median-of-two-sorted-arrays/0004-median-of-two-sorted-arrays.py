class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        if len(nums1) > len(nums2) :
            nums1 , nums2 = nums2 , nums1
        n = len(nums1) + len(nums2)
        half = n // 2;
        l = 0
        r = len(nums1) - 1
        while True:
            m1 = (l + r) // 2 
            m2 = half - m1 - 2
            l1 = nums1[m1] if m1>=0  else float("-inf")
            r1 = nums1[m1 + 1] if m1 + 1 < len(nums1) else  float("inf")

            l2 = nums2[m2] if m2 >= 0 else  float("-inf")
            r2 = nums2[m2 + 1] if m2 + 1 < len(nums2) else  float("inf")

            if l1 <= r2 and l2 <= r1:
                if n%2 == 0:
                    return (max(l1,l2) + min(r1,r2))/2.0
                else:
                    return min(r1,r2)
            elif l1 > r2:
                r = m1-1
            else :
                l = m1 + 1
        return -1

        