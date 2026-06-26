# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        nodes = [] 
        def inorder(node):
            if not node:
                return 
            inorder(node.left)
            nodes.append(node.val)
            inorder(node.right)
        inorder(root)
        for i in range(1,len(nodes)):
            if nodes[i-1] >= nodes[i]:
                return False
        return True
        