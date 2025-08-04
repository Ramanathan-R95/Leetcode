class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> s =new HashSet<>();
        for(int i:nums){
            if(s.contains(i)) return i;
            s.add(i);
        }
        return -1;

        
    }
}