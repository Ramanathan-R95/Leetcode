/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Node{
        TreeNode node;
        int index;
        Node(TreeNode node , int index){
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
      
        Deque<Node> queue = new ArrayDeque<>();
        queue.addLast(new Node(root,0));
        int result = 0;
        while(!queue.isEmpty()){
            int first = queue.peekFirst().index;
            int last = queue.peekLast().index;
            int l = queue.size() ;
            result = Math.max(result,last - first + 1 );
            for(int i=0;i < l;i++){
                Node ele = queue.pollFirst();
                if(ele.node.left != null)
                    queue.addLast(new Node(ele.node.left,ele.index * 2 +1));
                if(ele.node.right != null)
                    queue.addLast(new Node(ele.node.right,ele.index * 2 +2));
                

            }


        }
        return result;
        

        
    }
}