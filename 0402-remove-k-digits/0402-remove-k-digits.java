class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        int n = num.length();
        String result = "";
        for(int i=0;i<n;i++){
            
            char ele = num.charAt(i);
            while(!stack.isEmpty() && k> 0 && ((int)stack.peek()) > (int) ele ){
                stack.pop();
                k-=1;
            }
            stack.push(ele);
            
        }
        while(!stack.isEmpty() && k> 0 ){
                stack.pop();
                k-=1;
            }
        while(!stack.isEmpty()){
            result = result + stack.pop();
        }
        if(result.length() == 0)
            return "0";
        


        result =  new StringBuilder(result).reverse().toString();
        int st = 0;
        while(st < result.length() && result.charAt(st) == '0') st++;
        return st < result.length() ? result.substring(st): "0";
    }
}