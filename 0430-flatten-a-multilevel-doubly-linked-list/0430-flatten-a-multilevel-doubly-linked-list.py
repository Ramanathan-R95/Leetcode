"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, prev, next, child):
        self.val = val
        self.prev = prev
        self.next = next
        self.child = child
"""

class Solution(object):
    def flatten(self, head):
        """
        :type head: Node
        :rtype: Node
        """
        if not head : return head 
        cur = head 
        stack = []
        while cur :
            if cur.child :
                if cur.next :
                    stack.append(cur.next)
                cur.next = cur.child 
                cur.child.prev = cur
                cur.child = None

            if not cur.next  and stack :
                node = stack.pop()
                cur.next = node 
                if node : node.prev = cur 
            cur = cur.next 
        return head 
        