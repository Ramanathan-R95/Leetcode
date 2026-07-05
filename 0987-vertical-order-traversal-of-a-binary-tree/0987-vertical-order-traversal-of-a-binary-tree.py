# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def verticalTraversal(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []
        temp = []
        minVal  = 0 
        if not root:
            return result
        queue = deque()
        queue.append([0,0,root])
        while queue:
            ele = queue.popleft()
            if ele[2].left:
                queue.append([ele[0] - 1, ele[1] + 1, ele[2].left])
            if ele[2].right:
                queue.append([ele[0] + 1 , ele[1] + 1 , ele[2].right])
            temp.append(ele)
            minVal = min(minVal,ele[0])
        
        def criteria(x):
            return (x[0],x[1],x[2].val)



        temp.sort(key = criteria)
        prev = float("-inf")

        
        cur = 0
        for i in temp:
            if i[0] != prev:
                result.append([])
                prev = i[0]
            result[-1].append(i[2].val)
        

        return result
        
            

            

            

            

        
        
        