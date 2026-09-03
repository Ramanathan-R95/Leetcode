class Solution {
    public String longestNiceSubstring(String s) {
        int maxLen = 0;
        int n = s.length();
        String result ="";
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                HashSet<Character> set = new HashSet<>();
                boolean flag = true;
                for(int k = i; k <= j; k++){
                    set.add(s.charAt(k));

                }
                for(int k = i; k <= j; k++){
                    char c = s.charAt(k);
                    if(Character.isUpperCase(c)){
                        if(!set.contains((char)(c + 32))){
                            flag = false;
                            break;
                        }
                    }else{
                        if(!set.contains((char)(c - 32))){
                            flag = false;
                            break;
                        }
                    }

                }
                if(flag && j - i + 1 > maxLen){
                    maxLen = j - i + 1;
                    result = s.substring(i,j+1);
                }
            }
        }
        return result;


        
    }
}