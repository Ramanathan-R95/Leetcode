class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> l=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        for(int j : nums1){
            s.add(j);
        }
        for(int j : nums2){
            if (s.contains(j)){
                l.add(j);
                s.remove(j);
            }
        }
        int [] r=new int[l.size()];
        for(int j=0;j<l.size();j++){
            r[j]=l.get(j);
        }
        return r;

        
    }
}