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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null ;
        ListNode temp = head,prev ,next   ;
        int l = 0 ,i;
        while(temp!= null){
            l++;
            temp = temp.next ;
        }
       
        temp = head ;
        
        i = l - n;
        if(i == 0) return head.next ;
        for(int j = 0 ; j < i - 1; j ++){
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
       
        return head ;

        
    }
}