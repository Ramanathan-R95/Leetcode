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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        if(root == null)
            return result;
        deque.addLast(root);
        while(!deque.isEmpty()){
            TreeNode rightNode = deque.peekLast();
            result.add(rightNode.val);
            int l = deque.size();
            for(int i = 0; i < l; i++){
                TreeNode node = deque.removeFirst();
                if(node.left != null)
                    deque.addLast(node.left);
                if(node.right != null)
                    deque.addLast(node.right);
            }

        }
        return result;

        
    }
}