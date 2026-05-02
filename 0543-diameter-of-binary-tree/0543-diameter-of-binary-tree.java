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

    public int getDiameter(TreeNode node){
        if(node == null)
            return 0;
        int left = getDiameter(node.left);
        int right = getDiameter(node.right);
        result = Math.max(result , right + left  );
        return Math.max(left,right) + 1;





    }
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return result;
        
        
    }
}