class Solution {
    public void genPSE(int[] nums, int[] pse) {
        Stack<Integer> stack = new Stack<>() ;
        for(int i = 0 ; i < nums.length ; i++) {
            while(! stack.isEmpty() && nums[i] < nums[stack.peek()])
                stack.pop() ;
            pse[i]  = stack.isEmpty() ? -1 : stack.peek() ;
            stack.push(i) ;
        }
    }

    public void genNSE(int[] nums , int[] nse) {
        Stack<Integer> stack = new Stack<>() ;
        for(int i = nums.length - 1 ; i >=0 ; i--) {
            while(! stack.isEmpty() && nums[i]  <= nums[stack.peek()])
                stack.pop() ;
            nse[i] = stack.isEmpty() ? nums.length : stack.peek() ;
            stack.push(i)  ;
        }
    }

    public void genPGE(int[] nums , int[] pge) {
        Stack<Integer> stack = new Stack<>() ;
        for(int i = 0 ; i < nums.length ; i++) {
            while(!stack.isEmpty() && nums[i]  > nums[stack.peek()] ) 
                stack.pop() ;
            pge[i] = stack.isEmpty() ? -1 : stack.peek() ;
            stack.push(i) ;
        }
    }
    public void genNGE(int[] nums , int[] nge) {
        Stack<Integer> stack = new Stack<>() ;
        for (int i = nums.length - 1 ; i >= 0 ; i--) {
            while(!stack.isEmpty() && nums[i] >= nums[stack.peek()]) 
                stack.pop() ;
            nge[i] = stack.isEmpty() ? nums.length : stack.peek() ;
            stack.push(i) ;
        }
    }


    public long subArrayRanges(int[] nums) {


        int[] pse = new int[nums.length ] ;
        int[] nse = new int[nums.length ] ;
        int[] pge = new int[nums.length ] ;
        int[] nge = new int[nums.length ] ; 
        long sumMax = 0 ;
        long sumMin = 0 ;
        genPSE(nums,pse) ;
        genNSE(nums,nse) ;
        genPGE(nums,pge) ;
        genNGE(nums,nge) ;
        for(int i = 0 ; i < nums.length ; i++) {
            sumMin += (long)(i - pse[i] ) * (nse[i] - i) * nums[i] ;
            sumMax += (long)(i - pge[i]) * (nge[i] - i) * nums[i] ;
        }
        return sumMax - sumMin  ;






        
    }
}