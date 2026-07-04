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
    int result = 0;
    public int cal(TreeNode root){
        if(root == null)
            return 0;
        int left = cal(root.left);
        int right = cal(root.right);

        result = Math.max(result,left + right );

        return Math.max(left,right) + 1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        cal(root);
        return result;
        
    }
}