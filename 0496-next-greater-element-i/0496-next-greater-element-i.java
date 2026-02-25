class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m = new HashMap<>() ;
        Stack<Integer> stack = new Stack<>() ;
        int l = nums1.length ;
        int result[] = new int[l] ;
        for(int i = 0 ; i < l ; i++){
            m.put(nums1[i],i) ;
        }
        for(int i = nums2.length - 1  ; i >= 0 ; i--) {
            int ele = -1 ;
            while(stack.size() > 0 && nums2[i] > stack.peek()) {
                stack.pop() ;
            }

                if(!stack.isEmpty()) {
                    ele = stack.peek() ;

                }

                stack.push(nums2[i]) ;
            if(m.containsKey(nums2[i])){

                result[m.get(nums2[i])] = ele ;
                
                
            }
        }
        return result ;


        
}
}