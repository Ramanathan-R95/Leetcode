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
    public TreeNode construct(int st_i,int end_i,int st_p, int end_p,int[] postorder,int[] inorder){
        if(st_i > end_i || st_p > end_p)
            return null;
        TreeNode node = new TreeNode(postorder[end_p]);
        int ind = map.get(node.val);
        int left = ind - st_i;
        int right = end_i - ind;
        node.left = construct(st_i,ind - 1 , st_p ,end_p - right - 1,postorder,inorder);
        node.right = construct(ind+1,end_i,end_p - right,end_p - 1,postorder,inorder);
        
        return node;


    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        for(int i=0;i<n;i++)
            map.put(inorder[i],i);
        return construct(0,n-1,0,n-1,postorder,inorder);


        
    }
}