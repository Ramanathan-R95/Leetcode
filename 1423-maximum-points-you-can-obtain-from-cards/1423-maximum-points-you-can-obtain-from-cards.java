class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int result = 0;
        int[] lPSum = new int[k];
        int[] rSSum = new int[k];
        lPSum[0] = cardPoints[0];
        rSSum[0] = cardPoints[n-1];
        for(int i = 1 ; i < k; i++){
            lPSum[i] = lPSum[i-1] + cardPoints[i];
        }
        for(int i = 1 ; i < k; i++){
            rSSum[i] = rSSum[i - 1] + cardPoints[n - i - 1];
        }
        result = Math.max(lPSum[k-1],rSSum[k-1]);

        for(int i = 1; i < k; i++){
            int lsum = lPSum[i - 1];
            int rsum = rSSum[k - i - 1];

            
            result = Math.max(result , lsum + rsum);
        }
        return result;

        
    }
}