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
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) 
            return result;
        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            int l = queue.size();
            Integer [] arr = new Integer[l];
            for(int i = 0; i < l; i++){
                TreeNode node = queue.poll();
                int ind = flag? i : l - i - 1;
                arr[ind] = node.val;
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            List<Integer> ele = Arrays.asList(arr);
            result.add(ele);
            flag = !flag;



            
        }
        return result;

        
    }
}