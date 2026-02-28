class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>() ;
        HashMap<Integer,Integer> m = new HashMap<>() ;
        int[] result = new int[nums1.length] ;

        for (int i = nums2.length - 1 ; i>= 0 ; i--){
            int ele = -1 ;
            while ( !stack.isEmpty() && nums2[i] > stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ele = stack.peek() ;
            }




            m.put(nums2[i] , ele) ;
            stack.push(nums2[i]);
        }
        for(int i= 0 ; i < nums1.length ; i++) {
            if(m.containsKey(nums1[i])) {
                result[i] = m.get(nums1[i]) ;
            }
            else 
                result[i] = -1 ;

        }
        return result ;







        
    }
}