"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        temp = head 
        dummy = Node(0)
        cur = dummy 
        hm = {} 
        while temp :
            node = Node(temp.val)
            cur.next = node 
            hm[temp] = node
            temp = temp.next 
            cur = cur.next 
        cur = dummy.next 
        temp = head 
        while temp :
            if temp.random:
                cur.random = hm[temp.random]

            temp = temp.next 
            cur = cur.next 
        return dummy.next
            
        