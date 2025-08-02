class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        


        Set  <Integer> s = new HashSet<>();
        int l=0;
        int r;
        
        for(r=0;r < k+1; r++){
            if(r < nums.length ){if( s.contains(nums[r])) return true;
            s.add(nums[r]);}
        }
        for(r=k+1;r < nums.length;r++){
            s.remove(nums[l]);
            l++;
            if(s.contains(nums[r])) return true;
            s.add(nums[r]);
        }
        return false;

        
    }
}