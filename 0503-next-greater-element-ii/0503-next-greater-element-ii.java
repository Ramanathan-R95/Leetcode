class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] res = new int[nums.length] ;
        Stack<Integer> stack = new Stack<>() ;
        int l = nums.length ;
        for (int i = l -1 ; i >=0 ; i--){
            while(! stack.isEmpty() && nums[i] >=stack.peek()) stack.pop() ;
            stack.push(nums[i]) ;
        }
        for (int i = l -1 ; i >= 0 ; i--){
            int ele = -1 ;
            while(! stack.isEmpty() && nums[i] >= stack.peek()) stack.pop() ;
            if (! stack.isEmpty()) ele = stack.peek() ;
            stack.push(nums[i]) ;
            res[i] = ele ;
        }
        return res ;
        
        
    }
}