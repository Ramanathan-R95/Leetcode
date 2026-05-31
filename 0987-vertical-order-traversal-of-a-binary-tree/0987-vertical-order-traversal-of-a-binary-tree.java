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
    class Element{
        TreeNode node;
        int col;
        int row;

        Element(TreeNode node,int col,int row){
            this.node = node;
            this.col = col;
            this.row = row;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        Queue<Element> queue = new LinkedList<>();
        List<int[]> elements = new ArrayList<>();
        int minVal = 0;
        int maxVal = 0;
        queue.add(new Element(root,0,0));
        while(!queue.isEmpty()){
            Element ele = queue.remove();
            minVal = Math.min(minVal,ele.col);
            maxVal = Math.max(maxVal,ele.col);
            elements.add(new int[]{ele.col,ele.row,ele.node.val});
            if(ele.node.left != null) 
                queue.add(new Element(ele.node.left,ele.col-1,ele.row+1));
            if(ele.node.right != null)
                queue.add(new Element(ele.node.right,ele.col+1,ele.row+1));
            


        }
        Collections.sort(elements,(a,b)->{
            if(a[0] != b[0])
                return a[0] - b[0];
            if(a[1] != b[1])
                return a[1] - b[1];
            return a[2] - b[2];

        });
        int prevCol = Integer.MIN_VALUE;
        for(int[] temp : elements){
            int col = temp[0];
            int val = temp[2];
            if(col != prevCol){
                result.add(new ArrayList<>());
                prevCol = col;

            }
            result.get(result.size()-1).add(val);


        }
        return result;








      }
}