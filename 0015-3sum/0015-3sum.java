class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int l,r,sum;
        int n=nums.length;
        for (int j = 0 ; j <n ;j++ ){
            if (j > 0 && nums[j-1]==nums[j]){
                continue;

            }
            l=j+1;
            r=n-1;
            while(l < r){
                sum=nums[j]+nums[l]+nums[r];
                if (sum==0){
                    List<Integer> ele =Arrays.asList(nums[j],nums[l],nums[r]);
                    result.add(ele);
                    l++;
                    r--;
                    while (l < n &&nums[l] == nums[l-1]) l++;
                    while ( r > 0 && nums[r]==nums[r+1]) r--;
                   
                    
                }
                else if(sum > 0) r--;

                else l++;
            }
                    
                    
                
            
        }
        return result;
        
    }
}