/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head ;
        Node dummy = new Node(0) ;
        Node temp2 , cur = dummy ;
        Node cur2 ;
        
        while(temp != null) {
            Node n = new Node(temp.val) ;
            cur.next = n ;
            cur = cur.next ;
            temp = temp.next ;
        }
        temp = head ;
        temp2 = dummy.next ;
        while(temp != null){
            if(temp.random != null){
                cur = head ;
                cur2 = dummy.next ;
                while(cur != temp.random){
                    cur = cur.next ;
                    cur2 = cur2.next ;
                }
                temp2.random = cur2 ;
            }
            temp = temp.next ;
            temp2 = temp2.next ;
        }
        return dummy.next ;

        
    }
}