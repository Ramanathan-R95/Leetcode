# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def buildTree(self, preorder, inorder):
        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: Optional[TreeNode]
        """
        def construct(preorder , st_p , end_p , inorder , st_i, end_i):
            if st_i>end_i or st_p > end_p:
                return None
           
            node = TreeNode(preorder[st_p])
            ind = hashMap[preorder[st_p]]
            left_length = ind - st_i
            right_length = end_i - ind

            node.left = construct(preorder,st_p + 1 , st_p + left_length, inorder , st_i , ind - 1)
            node.right = construct(preorder, st_p +left_length + 1 ,end_p, inorder , ind + 1 , end_i)
            return node

        hashMap = {}
        n = len(preorder) 
        for i,x in enumerate(inorder):
            hashMap[x] = i
        return construct(preorder,0,n-1,inorder,0,n-1)
        
        
            
        