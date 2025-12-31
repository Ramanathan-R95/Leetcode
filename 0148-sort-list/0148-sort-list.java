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
    public ListNode getMid(ListNode head){
        ListNode fast ,slow ,prev ;
        slow = head ;
        fast = head ;
        prev = slow ;
        while(fast != null && fast.next != null){
            prev = slow ;
            slow = slow.next ;
            fast = fast.next.next ;
        }
        prev.next = null ;
        return slow ;

    }
    public ListNode sortList(ListNode head) {
        ListNode mid , temp1 ,temp2  , left ,right , dummy ,result ;
        if(head == null || head.next == null)  return head ;
        mid = getMid(head) ;
        left = sortList(head) ;
        right = sortList(mid) ;

        temp1 = left ;
        temp2 = right ;
        dummy = new ListNode(0) ;
        result = dummy ;
        
        while(temp1 != null && temp2 != null) {
            if(temp1.val <= temp2.val){
                result.next = temp1 ;
                temp1 = temp1.next ;
            }
            else{
                result.next = temp2 ;
                temp2 = temp2.next ;
            }
            result = result.next ;
        }
        if(temp1 != null) result.next = temp1 ;
        else result.next = temp2 ;
        return dummy.next  ;
        

        
    }
}