# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:
    def __init__(self):
        self.result = ""
    def preorder(self,node):
        if not node:
            self.result = self.result + ",#"
            return 
        self.result = self.result + f",{node.val}"
        self.preorder(node.left)
        self.preorder(node.right)

    def serialize(self, root):
        """Encodes a tree to a single string.
        
        :type root: TreeNode
        :rtype: str
        """
        self.preorder(root)
        
        return self.result

        

    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        tree = data.split(",")[1:]
        print(tree)
        ind = 0
        def construct():
            nonlocal ind
            if ind >= len(tree):
                return 
            if tree[ind] == "#":
                ind+=1
                return None
            
            node = TreeNode(int(tree[ind]))
            ind+=1
            node.left = construct()
            node.right = construct()
            return node
        return construct()
            
            



        

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))