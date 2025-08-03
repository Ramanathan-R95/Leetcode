class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int total=0;
        int t1=-1;
        int t2=-1;
        for(int r=0;r<fruits.length;r++){
            if(t1==-1) t1=fruits[r];
            else if(t2==-1 && t1!=fruits[r]) t2=fruits[r];
            else{
                if(!(t1==fruits[r] || t2==fruits[r])){
                    l=r-1;
                    while(l>0 && fruits[l]==fruits[l-1]) l--;
                    t1=fruits[l];
                    t2=fruits[r];

                }

            }
            total=Math.max(total,r-l+1);

        }
        return total;
    }
}