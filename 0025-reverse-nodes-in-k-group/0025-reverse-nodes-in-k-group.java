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
    public static ListNode getkth(ListNode head , int k){
        while (head != null && k > 1){
            head = head.next ;
            k-- ;
        }
        return head ;
    }
    
    
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode prev , cur , next , kthnode,follow ,temp = head ,dummy = new ListNode(0);
        dummy.next = head ;
        ListNode grpPrev = dummy ;

        while (true){
            kthnode = getkth(temp,k) ;
            if(kthnode == null) break ;
            follow = kthnode.next ;
            prev= null ;
            cur = temp ;
            next = cur ;
            while (cur != follow){
                next = cur.next ;
                cur.next = prev ;
                prev = cur ;
                cur = next ;

            }
            grpPrev.next = kthnode ;
            temp.next = follow;

            grpPrev = temp ;
            temp = temp.next ;
            




        }
        return dummy.next;

        
    }
}