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
    boolean result = false;
    public void checkSum(TreeNode node, int cur,int targetSum){
        if(result || node == null)
            return;
        cur+=node.val;
        if(cur == targetSum && node.left == null && node.right == null){
            result = true;
            return ;
        }
        checkSum(node.left,cur,targetSum);
        checkSum(node.right,cur,targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        checkSum(root,0,targetSum);
        return result;
        
    }
}