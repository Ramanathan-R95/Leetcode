class Solution {
    public void calNSE(int[] arr,int[] nse){
        Stack<Integer> stack = new Stack<>() ;
        for(int i=arr.length-1 ; i>=0 ; i--){
            while(! stack.isEmpty() && arr[i] <= arr[stack.peek()]) stack.pop();
            nse[i] = (stack.isEmpty()) ? arr.length :stack.peek() ;
            stack.push(i) ;
        }
    }
    public void calPSE(int[] arr , int[] pse){
        Stack<Integer> stack = new Stack<>() ;
        for(int i = 0 ; i < arr.length ; i++){
            while(! stack.isEmpty() && arr[i] < arr[stack.peek()]) stack.pop() ;
            pse[i] = (stack.isEmpty()) ? -1 : stack.peek() ;
            stack.push(i);
        }
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length ;
        int result = 0 ;
        int[] pse = new int[n] ;
        int[] nse = new int[n] ;
        int l ,r ;
        calPSE(arr,pse) ;
        calNSE(arr,nse) ;
        int mod = 1000000007 ;
        for (int i = 0 ; i < n ; i++){
            l = i - pse[i] ;
            r = nse[i] - i ;
            result = (int)((result + ((long)l * r * arr[i]) ) % mod) ;


        }
        return result ;

        
    }
}