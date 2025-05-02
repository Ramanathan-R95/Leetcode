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
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
            return 0;
        diameter(root);
        return res+1;
        
        
    
}
public int height(TreeNode node){
    if(node == null)
        return 0;
    int l=height(node.left);
    int r=height(node.right);
    return 1+Math.max(l,r);
}
public void diameter(TreeNode root){
    if(root==null)
            return ;
    
    int l=height(root.left);
    int r=height(root.right);

    
    res=Math.max(l+r-1,res);
    diameter(root.left);
    diameter(root.right);

    
}
}