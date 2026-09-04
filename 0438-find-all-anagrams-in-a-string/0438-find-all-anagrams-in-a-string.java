class Solution {
    public boolean check(int[] freq1 , int[] freq2){
        for(int i = 0; i < 256; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int l = 0;
        int n = s.length();
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        int k = p.length();
        if(k > n) return result;

        for(int i = 0; i < k; i++){
            freq1[p.charAt(i) - 'A']++;

        }
        for(int i = 0; i < k; i++){
            freq2[s.charAt(i) - 'A']++;

        }
        if(check(freq1,freq2)) result.add(0);
        for(int r = k ; r < n; r++){
            freq2[s.charAt(r) - 'A']++;
            freq2[s.charAt(l) - 'A']--;
            l++;
            if(check(freq1,freq2)) result.add(l);

        }
        return result;
        
    }
}