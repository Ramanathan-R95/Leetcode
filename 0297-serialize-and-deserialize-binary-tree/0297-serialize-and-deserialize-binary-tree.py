# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:

    def serialize(self, root):
        """Encodes a tree to a single string.
        
        :type root: TreeNode
        :rtype: str
        """
        result = ""
        def preOrder(node):
            nonlocal result
            if not node:
                result += "#,"
                return
            result += f"{node.val},"
            preOrder(node.left)
            preOrder(node.right)
            return 
        preOrder(root)
        return result


    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        
        values = data.split(",")[:-1]
        ind = 0
        l = len(values)
        def create():
            nonlocal ind
            if  ind >= l or values[ind] == "#" :
                return None
            node = TreeNode(values[ind])
            ind += 1
            node.left = create()
            ind += 1
            node.right = create()
            return node
        return create()
            
        

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))