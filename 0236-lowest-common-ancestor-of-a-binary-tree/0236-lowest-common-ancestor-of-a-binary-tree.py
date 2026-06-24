# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def dfs(self,nodes,node,target):
        if not node:
            return False
        nodes.append(node)
        if node == target:
            return True
        if self.dfs(nodes,node.left,target) or self.dfs(nodes,node.right,target):
            return True
        nodes.pop()
        return False
        

    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        stack_p = []
        stack_q = []
        self.dfs(stack_p,root,p)
        self.dfs(stack_q,root,q)
        lca = None
        l = min(len(stack_p),len(stack_q))
     
        for i in range(l):
            if stack_p[i] == stack_q[i]:
                lca = stack_p[i]
            else:
                break
        return lca
        
        
        