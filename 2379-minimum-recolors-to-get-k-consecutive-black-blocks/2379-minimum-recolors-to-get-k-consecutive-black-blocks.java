class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int n = blocks.length();
        int result = n;
        int temp = 0;
        for(int i = 0; i < n; i++){
            temp = 0;
            for(int j = i; j < n; j++){
                if(blocks.charAt(j) == 'W') temp++;
                if(j - i + 1 == k){
                    result = Math.min(result, temp);
                }
            }
        }
        return result;


    }
}