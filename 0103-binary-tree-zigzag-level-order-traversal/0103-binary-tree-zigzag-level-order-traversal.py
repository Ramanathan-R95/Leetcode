# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []
        dq = Deque()
        if not root:
            return result
        dq.append(root)
        flag = True
        while dq:
            length = len(dq)
            l = [0] * length 
            for i in range(length):
                node = dq.popleft()
                
                index = i if flag else length - i - 1
                l[index] = node.val
                if node.left:
                    dq.append(node.left)
                if node.right:
                    dq.append(node.right)
            result.append(l)
            flag = not flag
        return result


        
        