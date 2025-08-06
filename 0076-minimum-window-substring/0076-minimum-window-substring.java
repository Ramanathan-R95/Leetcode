class Solution {
    public String minWindow(String s, String t) {
        int resultLen = Integer.MAX_VALUE;
        int result[]=new int[2];
        int l = 0;
        int r = 0;
        int n1 = s.length();
        int n2 = t.length();
        int temp = 0;
        int [] counts = new int[58];
        for (int j = 0 ; j < n2 ; j++){
            
            counts[t.charAt(j) - 'A']--;
        }
        for (r = 0 ; r < n1 ; r++){
            if(counts[s.charAt(r) - 'A']  < 0) temp++;
            counts[s.charAt(r) - 'A']++;
            while(temp == n2){
                if(resultLen > r-l+1){
                    resultLen = r-l+1;
                    result[0]=l;
                    result[1]=r+1;
                }
                counts[s.charAt(l) - 'A']--;
                if (counts[s.charAt(l) - 'A'] < 0) temp--;
                l++;
            }
        }
      
        return s.substring(result[0],result[1])    ;




        
        
    }
}