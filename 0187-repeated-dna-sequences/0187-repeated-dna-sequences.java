class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
         List<String> res = new ArrayList<>();
         Map<String,Integer> count = new HashMap<>();
         for(int i = 0; i < s.length() ; i++){
            if(!(i+10 <= s.length())) break;
            String seq = s.substring(i,i+10);
            if(count.containsKey(seq)){
                count.put(seq,count.get(seq)+1);
            }
            else{
                count.put(seq,1);
            }
         }
         for(String i : count.keySet()){
            int c=count.get(i);
            if(c > 1) res.add(i);
         } 
         return res ;


            
         


    }
}