class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> m= new HashMap<>();
        int k;
        for(int i =0; i<nums.length; i++){
            k=target-nums[i];
            if (m.containsKey(k) ){
                int j=m.get(k);
                result[0]=j;
                result[1]=i;
                break;
            }
            else
                m.put(nums[i],i);
        }
        return result;
        
    }
}