class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m = new HashMap<>() ;
        int l1 = nums1.length ;
        int[] res = new int[l1] ;
        for (int j = 0 ; j < l1 ; j++){
            m.put(nums1[j],j) ;
        }
        for(int j= 0 ;j < nums2.length ; j++){
            if(m.containsKey(nums2[j])){
                int nextEle = -1 ;
                for(int i = j + 1 ; i < nums2.length ; i++){
                    if(nums2[i] > nums2[j]){
                        nextEle = nums2[i] ;
                        break ;
                    }

                }
                res[m.get(nums2[j])] = nextEle ;



            }
        }
        return res ;
        
    }
}