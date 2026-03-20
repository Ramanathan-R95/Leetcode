class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length ;
        int [] stack = new int[n] ;
        int top = -1 ;
        for(int i=0;i<n;i++){
            if(asteroids[i] > 0){
                stack[++top] = asteroids[i] ;

            }
            else{
                while(top != -1 && stack[top] > 0 && stack[top] < Math.abs(asteroids[i]))
                    top--;
                if(top == -1 || stack[top] < 0 ) 
                    stack[++top] = asteroids[i] ;
                else if(top > -1  && stack[top] == Math.abs(asteroids[i])) 
                    top-- ;
            }

        }
        int[] result  = new int[top + 1] ;
        for (int i=0;i<=top;i++) result[i] = stack[i] ;
        return result;
        
        




        
    }
}