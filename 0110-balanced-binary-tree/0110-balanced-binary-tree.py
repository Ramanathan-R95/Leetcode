# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def calHeight(self , root):
        if not root :
            return 1
        left = self.calHeight(root.left)
        right = self.calHeight(root.right)
        return 1 + max(left,right) 
    def isBalanced(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: bool
        """
        if not root :
            return True
        q = [root]
        visited = set()
        while q :
            node = q.pop(0)
            left = self.calHeight(node.left)
            right = self.calHeight(node.right)
            if abs(right - left ) > 1 :
                return False
            visited.add(node)
            if node.left and node.left not in visited :
                q.append(node.left)
            if node.right and node.right not in visited :
                q.append(node.right)
        return True 

        