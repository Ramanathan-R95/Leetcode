# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        cur = float("-inf")
        def preorder(root):
            nonlocal cur
            if not root:
                return True
            
            left = preorder(root.left)

            if root.val <= cur:
                return False
            
            cur = root.val

            right = preorder(root.right)

            return left and right
        return preorder(root)

             
        