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
        def encode(node):
            nonlocal result
            if not node:
                result += "#,"
                return
            result += f"{node.val},"
            encode(node.left)
            encode(node.right)
            return 
        encode(root)
        return result
    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        tree = data.split(",")[:-1]
        n = len(tree)
        ind = 0
        def decode():
            nonlocal ind
            if ind == n:
                return None

            if tree[ind] == "#":
                ind+=1
                return None
            node = TreeNode(int(tree[ind]))
            ind+=1
            node.left = decode()
            node.right = decode()
            return node
        return decode()

        

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))