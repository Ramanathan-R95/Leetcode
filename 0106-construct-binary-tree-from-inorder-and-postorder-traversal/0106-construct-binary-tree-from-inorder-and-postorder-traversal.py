# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self,i_l,i_r,p_l ,p_r,inorder,postorder,hashmap):
        if  i_l > i_r or p_l > p_r  :
            return None
        node = TreeNode(postorder[p_r])
        ind = hashmap[node.val]
        l_len = ind - i_l
        r_len = i_r - ind
        node.left = self.helper(i_l,ind - 1,p_l, p_r - r_len - 1 ,inorder,postorder,hashmap)
        node.right = self.helper(ind + 1, i_r , p_r - r_len , p_r - 1 , inorder, postorder, hashmap)
        return node
    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
        hashmap = {}
        n = len(inorder)
        for i in range(len(inorder)):
            hashmap[inorder[i]] = i
        return self.helper(0 , n - 1 , 0 , n -1 , inorder,postorder,hashmap)





        