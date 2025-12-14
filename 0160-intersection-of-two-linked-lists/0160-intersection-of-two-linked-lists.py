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
        flag = False
        intersect =None
        while temp1 :
            temp1.val = temp1.val * (-1)
            temp1 = temp1.next 
        while temp2 :
            if temp2.val < 1 :
                flag = True
                intersect = temp2
                break
            temp2 = temp2.next
        
        temp1 = headA
        while temp1 :
            temp1.val = temp1.val *(-1)
            temp1 = temp1.next
        if flag == False :
            return None   
        return intersect


            
        
        