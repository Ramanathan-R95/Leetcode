/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp,slow ,fast, middle ;
        slow = head ;
        fast = head ;
        while(fast != null && fast.next != null) {
            fast = fast.next.next ;
            slow = slow.next ;

        }
        middle = slow ;
        slow = null ;
        temp = middle ;
        fast = temp ;
        while( fast != null) {
            fast = temp.next ;
            temp.next = slow ;
            slow = temp ;
            temp = fast ;


        }
        temp = head ;
        while( slow!= null ) {
            if(temp.val != slow.val) return false ;
            slow = slow.next ;
            temp = temp.next ;

        }
        return true;
        
    }
}