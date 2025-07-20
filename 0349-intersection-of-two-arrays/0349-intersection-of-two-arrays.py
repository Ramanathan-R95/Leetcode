class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        p1=0
        p2=0
        res=[]
        nums1.sort()
        nums2.sort()
        n1=len(nums1)
        n2=len(nums2)
        while p1 < n1 and p2 < n2 :
            if nums1[p1] == nums2[p2]:
                res.append(nums1[p1])
                p1+=1
                p2+=1
            elif nums1[p1] > nums2[p2] :
                p2+=1
            else:
                p1+=1
        return list(set(res))


        

        