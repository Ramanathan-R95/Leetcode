class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        int n = num.length();
        String result = "";
        for(int i=0;i<n;i++){
            while( k>0 && !stack.isEmpty() && stack.peek() - '0' >  num.charAt(i) - '0'){
                stack.pop();
                k--;
            }
            if(stack.isEmpty() && num.charAt(i) == '0' )    continue;
            stack.push(num.charAt(i));

        }

        while(k>0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        if(result.length() == 0) return "0";
        return new StringBuilder(result).reverse().toString();
















        
            








    }
}