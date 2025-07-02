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
    int max;
    int cur=0;
    int num=Integer.MAX_VALUE;
    
    public void findK(TreeNode node){

       
        if (node==null){
            return ;
        }
        
        

        findK(node.left);
         cur++;
        if (cur>=max && num==Integer.MAX_VALUE)
          num = node.val;
       
       
         findK(node.right);
  

    }
    public int kthSmallest(TreeNode root, int k) {
        max=k;
        findK(root);
        return num;
     

        
    }
}