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
        ArrayList<Integer> l = new ArrayList<>();
        ListNode temp = head ;
        while(temp != null){
            l.add(temp.val);
            temp = temp.next ;
        }
        int n = l.size();
        for(int j = 0 ; j < n / 2 ; j++ ){
            if(!(l.get(j) == l.get(n-j-1))) return false;
        }
        return true;
        

        
    }
}