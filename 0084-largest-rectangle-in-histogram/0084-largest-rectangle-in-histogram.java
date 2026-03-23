class Solution {
    public void genPSE(int[] nums,int[] pse){
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<nums.length;i++){
            while(! stack.isEmpty() && nums[i] <= nums[stack.peek()]) stack.pop();
            if(stack.isEmpty()) pse[i]= -1;
            else pse[i]=stack.peek();
            stack.push(i);
        }
    }
        


    
    public void genNSE(int[] nums,int[] nse){
        Stack<Integer> stack = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(! stack.isEmpty() && nums[i] <= nums[stack.peek()] ) stack.pop();
            if( stack.isEmpty())  nse[i] = nums.length;
            else nse[i] = stack.peek();
            stack.push(i);
        }
    }

    public int largestRectangleArea(int[] heights) {
        int[] nse = new int[heights.length];
        int[] pse = new int[heights.length];
        int result=0;
        int l,r;
        genNSE(heights,nse);
        genPSE(heights,pse);
        for(int i=0;i< heights.length;i++){
            l=pse[i];
            r=nse[i];
            result = Math.max(result,(r-l-1)*heights[i]);




        }
        return result;
        
        
    }
}