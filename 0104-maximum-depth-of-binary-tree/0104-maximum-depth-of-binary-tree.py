# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def findDepth(self,root):
        if not root:
            return 0
        return max(self.findDepth(root.left),self.findDepth(root.right)) + 1
    def maxDepth(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        return self.findDepth(root)
        