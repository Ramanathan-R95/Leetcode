# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        queue = deque()
        result = 0
        queue.append([root,0])
        
        while queue:
            l = len(queue)
            result = max(result,queue[-1][1] - queue[0][1] + 1)
            for i in range(l):
                node = queue.popleft()
                if node[0].left:
                    queue.append([node[0].left, 2*node[1] + 1])
                if node[0].right:
                    queue.append([node[0].right, 2*node[1] + 2])
        return result




        