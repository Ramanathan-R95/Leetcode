# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0,[0] left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        queue = deque()
        queue.append([root,0])
        result = 0
        while queue:
            result = max(result , queue[-1][1] - queue[0][1] + 1)
            for i in range(len(queue)):
                node = queue.popleft()
                if node[0].left:
                    queue.append([node[0].left , node[1] * 2 + 1])
                if node[0].right:
                    queue.append([node[0].right , node[1] * 2 + 2])
                    
        return result



        