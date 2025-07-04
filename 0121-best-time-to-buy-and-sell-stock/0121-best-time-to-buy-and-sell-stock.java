class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buy=prices[0];
        for (int j : prices){
            if(j< buy)
                buy=j;
            maxProfit=Math.max(maxProfit,j-buy);
        
    }
    return maxProfit;}
}