class Solution {
    public int eatingHours(int[] piles, double h){
        double total = 0;
        for(int j : piles){
            total += Math.ceil(j/h);
        }
        return (int)total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int  l = 0;
        int r = 0;
        int m,res=Integer.MAX_VALUE ;
        for(int j : piles) r =Math.max(j,r);
        while(l <= r){
            m = (l + r)/2;
            int k =eatingHours(piles,m) ;
            if(k <= h) {
                res = Math.min(res,m);
                r = m - 1;


            }
            else{
                l = m + 1;


            }

        }
        return res;
        
    }
}