class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int result = Integer.MIN_VALUE;
        int n = heights.length ;
        int pse,nse ,ind;
        for(int i=0;i<n;i++){

            while(!stack.empty() && heights[i] <= heights[stack.peek()]){
                ind = stack.pop();
                nse = i ;
                pse = stack.isEmpty()? -1 : stack.peek();
                result = Math.max(result,(nse-pse-1)* heights[ind]);



            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ind = stack.pop();
            pse = stack.isEmpty()? -1 : stack.peek();
            nse = n ;
            result = Math.max(result,(nse-pse-1)* heights[ind]);
        }
        return result;
        
    }
}