# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        visited = set()
        result = False
        def pre_order(node , target):
            nonlocal result
            target -= node.val
            if not node.left and not node.right and target == 0:
                result = True
                return 
            if node.left :
                pre_order(node.left , target)
            if node.right:
                pre_order(node.right , target)
            return
        if not root : return False 
        pre_order(root,targetSum)
        return result



            
                
       

            
        