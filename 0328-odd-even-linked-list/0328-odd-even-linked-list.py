# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def oddEvenList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if head is None or head.next is None :
            return head
        even_head = head.next 
        even = even_head
        odd = head
        while even and even.next  :
            odd.next = odd.next.next 
            even.next = even.next.next 
            odd = odd.next
            even = even.next
        odd.next = even_head
        return head
            


