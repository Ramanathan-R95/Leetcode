class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int i: prices){
            result = Math.max(result,i - min);
            min = Math.min(min,i);
        }
        return result;

        
    }
}