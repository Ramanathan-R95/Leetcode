class Solution {
    public String mod(String a , String b){
        int l = b.length();
        while(a.length() >= b.length() && a.substring(0,l).equals(b)){
            a = a.substring(l);

        }
        
        return a;
        
    }
    public String help(String a , String b){
        if(b.length() == 0) return a;
        String m = mod(a,b);
        // if(m.length() == 0) return "";
        if(m.length() >= b.length()) return new String();
        return help(b,m);
    }
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length() >= str2.length())
            return help(str1,str2);
        else
            return help(str2,str1);
    }
}