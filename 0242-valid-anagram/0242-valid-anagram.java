class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;
        HashMap<Character,Integer> m=new HashMap<>();
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(m.containsKey(c)){
                int k=m.get(c);
                m.put(c,k+1);
            }
            else{
                m.put(c,1);
            }
        }
        for(int j=0;j<t.length();j++){
            char c=t.charAt(j);
            if(m.containsKey(c)){
                int k=m.get(c)-1;
                if(k<0)
                    return false;
                m.put(c,k);
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}