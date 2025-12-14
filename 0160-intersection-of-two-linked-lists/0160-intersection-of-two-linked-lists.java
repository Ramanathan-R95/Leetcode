/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) { 

        HashSet<ListNode> s = new HashSet<>();
        ListNode temp = headA ;
        while(temp != null){
            s.add(temp);
            temp = temp.next ;
        }
        temp = headB ;
        while(temp != null){
            if(s.contains(temp)) return temp ;
            temp = temp.next;
        }
        return null;
    }
}