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
    Map<Integer,Integer> map = new HashMap<>();

    public TreeNode construct(int st_p , int end_p , int st_i , int end_i ,int[] preorder, int[] inorder){
        if(st_p > end_p || st_i > end_i)
            return null;
        
        TreeNode node = new TreeNode(preorder[st_p]);
        int ind = map.get(node.val);
        int leftLen = ind - st_i;
        int rightLen = end_i - ind;
        node.left = construct(st_p + 1 ,st_p + leftLen,st_i , ind - 1,preorder,inorder);
        node.right = construct(st_p + leftLen + 1 ,end_p ,ind + 1,end_i ,preorder,inorder);
        return node;
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for(int i = 0 ; i < n ; i++)
            map.put(inorder[i] , i);
        return construct(0,n - 1,0,n - 1,preorder,inorder);
        
        
    }
}