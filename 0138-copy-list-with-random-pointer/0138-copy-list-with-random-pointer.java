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
        Node temp , cur , n , dummy = new  Node(0) ;
        HashMap<Node,Node> m = new HashMap<>() ;
        temp = head ;
        cur = dummy ;
        while (temp != null){
            n = new Node(temp.val) ;
            cur.next = n ;
           
            temp = temp.next ;
            cur = cur.next ;
        }
        cur = dummy.next ;
        temp = head ;
        while(temp != null){
             m.put(temp,cur) ;
             temp = temp.next ;
             cur = cur.next ;

        }
        temp = head ;
        cur = dummy.next ;
        while(temp != null){
            if (temp.random != null){
                cur.random = m.get(temp.random) ;
            }
            temp = temp.next ;
            cur = cur.next ;
        }
        return dummy.next ;

        
    }
}