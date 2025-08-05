class Solution {
    public boolean checkStr(int[] count){
        for(int i:count) {
            if(i<0) return false;

        }
        return true;
    }
    public String minWindow(String s, String t) {
        String result = new String();
        int resultNum=Integer.MAX_VALUE;
       int l=0;
       int r;
       int[] count=new int[122];
       for(int i = 0; i < t.length() ; i++){
        count[t.charAt(i)-'A']--;
       }
       for(r=0;r<s.length();r++){
        count[s.charAt(r)-'A']++;
        if(checkStr(count)){
            
            while(l<=r && checkStr(count)){
                
                if(checkStr(count) && r-l+1 < resultNum){
                    resultNum=r-l+1;
                    result=s.substring(l,r+1);}
                count[s.charAt(l)-'A']--;
                l++;
                
            }        

            

        

       }
       }
        return result;
        
    }
}