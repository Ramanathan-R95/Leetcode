# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        if head==None:
            return False
        slow=head
        fast=head
        while fast.next!=None and fast.next.next!=None:
            fast=fast.next.next
            slow=slow.next
           
            if slow== fast:
                return True
           
        return False

        