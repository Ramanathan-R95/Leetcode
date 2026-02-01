class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>() ;
        int n = s.length() ;
        for (int i = 0 ; i < n ; i++){
            char c = s.charAt(i) ;
            if (c == '(' || c == '{' || c == '['){
                stack.push(c) ;
            }
            else {
                if(stack.size() ==0 ) return false;
                char temp = stack.pop();
                if(c == ')' && temp != '(') return false;
                else if(c == ']' && temp != '[' )return false;
                else if(c == '}' && temp != '{') return false;
            }

                 
            
        }
        if(stack.size() > 0) return false ;
        return true;
        
    }
}