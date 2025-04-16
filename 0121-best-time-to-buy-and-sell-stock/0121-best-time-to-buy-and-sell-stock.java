class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int cur=prices[0];
        for(int j=1;j<prices.length;j++){
            if(prices[j]-cur>max_profit){
                max_profit=prices[j]-cur;
            }
            if(prices[j]<cur)
                cur=prices[j];
        }
        return max_profit;
        
    }
}