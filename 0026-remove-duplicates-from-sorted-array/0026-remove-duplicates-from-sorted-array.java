class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        Set<Integer> s=new HashSet<>();
        s.add(nums[0]);
        for(int i=1; i < nums.length ; i++){
            if (s.contains(nums[i]))
                continue;
            nums[j]=nums[i];
            s.add(nums[j]);
            j++;           
           
        }
        return s.size();
        
    }
}