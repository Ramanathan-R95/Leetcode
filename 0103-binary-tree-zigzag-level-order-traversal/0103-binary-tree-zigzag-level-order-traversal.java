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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if(root == null) return result;
        queue.addLast(root);
        boolean flag = true;
        while(! queue.isEmpty()){
            int l = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<l;j++){
                TreeNode node = queue.removeFirst();
                list.add(node.val);
                if(node.left != null) queue.addLast(node.left);
                if(node.right != null) queue.addLast(node.right);



            }
            if(!flag) Collections.reverse(list);
            flag = !flag;
            result.add(list);





        }
        return result;
        
    }
}