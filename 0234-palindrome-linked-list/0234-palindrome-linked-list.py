# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """
        slow = head
        fast = head 
        while fast and fast.next :
            slow = slow.next 
            fast = fast.next.next 
        middle = slow
        slow = None
        cur = middle
        fast = cur 
        while fast :
            fast = cur.next 
            cur.next = slow 
            slow = cur
            cur = fast 
        cur = head

        while slow :
            if  slow.val != cur.val :
                return False
            slow = slow.next
            cur = cur.next 
        return True
        
        
        