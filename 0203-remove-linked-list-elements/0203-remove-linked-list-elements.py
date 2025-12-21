# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: Optional[ListNode]
        :type val: int
        :rtype: Optional[ListNode]
        """
        while head and head.val == val :
            head = head.next
        temp = head 
        prev = head
        next = head 
        while temp:
            next = next.next 
            if temp.val == val :
                
                prev.next = next 
                
                
            else :   
                prev = temp
            temp = next
        
        return head 