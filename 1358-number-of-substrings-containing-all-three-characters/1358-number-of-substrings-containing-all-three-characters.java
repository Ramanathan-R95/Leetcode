class Solution {
    public int numberOfSubstrings(String s) {
        int result = 0;
        int[] last = {-1,-1,-1};
        int min = -1;
        for(int i = 0; i < s.length(); i++){
            int ind = s.charAt(i) - 'a';
            last[ind] = i;
            min = Integer.MAX_VALUE;
            for(int j : last)
                min = Math.min(min,j);
            result += min + 1;            


        }
        return result;


        
    }
}