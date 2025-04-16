class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
       
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
           }
           else{
                if(st.isEmpty())
                  return false;
                char h=st.pop();
                if(c==')' && h!='(' )
                    return false;
                else if(c=='}' && h!='{')
                    return false;
                    else if(c==']' && h!='[')
                    return false;
               
           }

        }
        if(st.isEmpty())
        return true;
        return false;
    }
}