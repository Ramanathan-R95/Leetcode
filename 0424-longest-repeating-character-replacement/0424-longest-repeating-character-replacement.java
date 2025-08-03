class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        int l=0;
        int r;
        int maxFreq = 0;
        int[] frq=new int[26];
        for( r=0 ; r < s.length() ; r++){
            frq[s.charAt(r)-'A']++;
            if(maxFreq < frq[s.charAt(r)-'A']){
                maxFreq=frq[s.charAt(r)-'A'];
            }
            if(r-l+1 - maxFreq <= k) result = Math.max(result,r-l+1);
            else{
                frq[s.charAt(l)-'A']--;
                l++;
            }

        }
        return result;
        
        
    }
}