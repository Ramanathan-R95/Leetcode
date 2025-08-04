class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int n=nums.length/2;
        for(int j=0;j<nums.length;j++){
            if(m.containsKey(nums[j])){
                int k=m.get(nums[j])+1;
                if(k==n) return nums[j];
                m.put(nums[j],k);
            }
            else m.put(nums[j],1);

        }
        return -1;
        
    }
}