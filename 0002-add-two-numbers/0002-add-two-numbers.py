# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        head = ListNode(0)
        temp = head
        
        carry = 0 
        while carry or l1 or l2 :
            sum = 0 
            sum += carry 
            if l1 : sum += l1.val
            if l2 : sum += l2.val
            if sum > 9 :
                carry = 1 
                sum = sum % 10 
            else :
                carry = 0 
            temp.next = ListNode(sum) 
            temp = temp.next 
            if l1 :l1 = l1.next 
            if l2 :l2 = l2.next 
        return head.next 
            
            






        