# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if head is None or head.next is None : return head
        value = head.val
        prev = head
        temp = head.next

        while temp :
            if temp.val == prev.val :
                prev.next = temp.next 
            else :
                prev = temp
            temp = temp.next
        return head


        