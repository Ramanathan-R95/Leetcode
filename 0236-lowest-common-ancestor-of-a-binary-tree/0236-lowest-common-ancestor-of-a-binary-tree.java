/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean createPath(TreeNode root,TreeNode p,ArrayList<TreeNode> result){
        if(root == null)
            return false;
        if(root == p){
            result.add(p);
            return true;
        }
        result.add(root);
        boolean left = createPath(root.left,p,result);
        boolean right = createPath(root.right,p ,result);
        if(!left && !right){
            result.remove(result.size() - 1);
            return false;
        }
        return true;




    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path_p = new ArrayList<>();
        ArrayList<TreeNode> path_q = new ArrayList<>();
        int m;
        TreeNode result = null;
        createPath(root,p,path_p);

        createPath(root,q,path_q);

        m = Math.min(path_p.size(),path_q.size());
        for(int i = 0; i < m; i++){
            if(path_p.get(i) == path_q.get(i)){
                result = path_q.get(i);
            }
            else{
                break;
            }
        }
        return result;


 
        
    }
}