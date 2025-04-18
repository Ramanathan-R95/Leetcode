/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    Set<ListNode> s=new HashSet<>();
    boolean res=false;
    public void dFS(ListNode node){
        if(node==null)
            return;
        if(s.contains(node)){
            res=true;
            return;
        }
        s.add(node);
        dFS(node.next);


    }
        

    public boolean hasCycle(ListNode head) {
        dFS(head);
        return res;

        
    }
}