# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []
        deque = []
        flag = True
        if not root:
            return []
        deque.append(root)
        while deque:
            n = len(deque)
            level = [0]*n
            for i in range(n):
                ind = i if flag else n-i-1
                node = deque.pop(0)
                level[ind] = node.val
                if node.left:
                    deque.append(node.left)
                if node.right:
                    deque.append(node.right)
            flag = not flag
            result.append(level)
        return result




        