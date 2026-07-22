class Solution {
    public int getMax(int[] arr){
        int m = 0;
        for(int i:arr)
            m = Math.max(m,i);
        return m;
    }
    public int characterReplacement(String s, int k) {
        int[] freq = new int[256];
        int l=0 ,r = 0,maxVal = 0,maxInd = 0;
        int result = 0;
        for(r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            int ind = ch - 'A';
            freq[ind]++;
            maxVal = Math.max(maxVal,freq[ind]);
            while((r - l + 1 ) - maxVal > k ){
                freq[s.charAt(l) - 'A']--;
                maxVal = getMax(freq);
                l++;


            }
            result = Math.max(result,r - l + 1);



        }
        return result;
        
    }
}