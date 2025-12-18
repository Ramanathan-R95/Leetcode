# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        temp1 = headA
        temp2 = headB

        while True:
            if temp1 == temp2 :
                return temp1
            if temp1.next is None :
                temp1 = headB
            else :
                temp1 = temp1.next
            if temp2.next is None :
                temp2 = headA
            else :
                temp2 = temp2.next 
            if temp1.next is None and temp2.next is None : break
        if temp1 == temp2 : return temp1
        return None

        