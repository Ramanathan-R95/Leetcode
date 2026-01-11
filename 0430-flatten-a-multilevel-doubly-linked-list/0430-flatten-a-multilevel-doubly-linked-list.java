/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node helper(Node head){
        Node last ,temp = head,prev = null ;
        while (temp != null){
            prev = temp ;
            if(temp.child != null){
                last = helper(temp.child) ;
                last.next = temp.next ;
                temp.next = temp.child ;
                temp.child = null ;
                temp.next.prev = temp ;
                if(last.next != null) last.next.prev = last ;


            }
            temp = temp.next ; 
        }
        return prev ;
    }
    public Node flatten(Node head) {
        helper(head) ;
        return head ;
        
        
    }
}