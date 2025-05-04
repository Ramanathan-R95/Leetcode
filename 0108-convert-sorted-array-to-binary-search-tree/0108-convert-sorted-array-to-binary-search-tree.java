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
    public TreeNode sortedArrayToBST(int[] nums) {

        TreeNode root=bst(nums,0,nums.length-1);
        return root;
        
        
    }
    public TreeNode bst(int []nums,int s,int e){
        if(s<=e){
            int m=(s+e+1)/2;
            TreeNode n=new TreeNode(nums[m]);
            n.left=bst(nums,s,m-1);
            n.right=bst(nums,m+1,e);
            return n;
                    }
   
    
    return null;}
}