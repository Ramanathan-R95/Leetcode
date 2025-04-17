class Solution {
    public boolean isAnagram(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        if(l1!=l2)
            return false;
        HashMap<Character,Integer> m=new HashMap<>();
        for(int j=0;j<l1;j++){
            char c=s.charAt(j);
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }
            else{
                m.put(c,1);
            }
        }
        for(int j=0;j<l2;j++){
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