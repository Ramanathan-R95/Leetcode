class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length -1;
        int [] res=new int[2];
        int t;
        while(l < r){
            t=numbers[l] + numbers[r];
            
            if(t == target){
                res[0]=l+1;
                res[1]=r+1;
                return res;
            }
            else if (t > target)
                r--;
            else
                l++;
        }
        return res;
        
    }
}