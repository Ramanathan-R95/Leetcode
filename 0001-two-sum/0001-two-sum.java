class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int a[]=new int[2];
        for(int j=0;j<nums.length;j++){
            if(m.containsKey(target-nums[j]))
            {
                a[0]=m.get(target-nums[j]);
                a[1]=j;
                return a;
            }
            m.put(nums[j],j);
        }
        return a;

        
    }
}
