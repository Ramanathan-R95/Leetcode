class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        map = { ele : i  for i , ele in enumerate(nums1)}
        stack = []
        result = [-1] * len(nums1)
        for i in range(len(nums2)-1 , -1 , -1) :


            while stack != [] and nums2[i] > stack[-1] :
                stack.pop()
            if nums2[i] in map :
                if stack != [] :
                    result[map[nums2[i]]] = stack[-1] 
            stack.append(nums2[i]) 
        return result 




        