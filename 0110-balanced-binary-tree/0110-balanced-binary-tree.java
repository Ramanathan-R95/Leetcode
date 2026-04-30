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
    public int checkHeight(TreeNode node){
        if(node == null)
            return 1;
        int left = checkHeight(node.left);
        int right = checkHeight(node.right);
        if(Math.abs(left - right) > 1)
            return -1;
        if(left == -1 || right == -1)
            return -1;
        return 1 + Math.max(left , right);
    }

    public boolean isBalanced(TreeNode root) {
        int result = checkHeight(root);
        if(result == -1)
            return false;
        return true;
       
        
    }
}