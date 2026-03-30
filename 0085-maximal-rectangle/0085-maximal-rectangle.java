class Solution {
    public int calMaxArea(char[][] matrix,int row,int n){
        int[] nums = new int[n];
        int pse, ind ,result = Integer.MIN_VALUE;
        for(int i =0;i<= row;i++){
            if(i==0){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]=='1')
                        nums[j] = 1;
                }
            }
            else{
                for(int j=0;j<n;j++){
                    if(matrix[i][j]== '1')
                        nums[j]+= 1;
                    else 
                        nums[j] =0;
                }
            }
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(! stack.isEmpty() && nums[i] <= nums[stack.peek()]){
                ind = stack.pop();
                pse = stack.isEmpty() ? -1 : stack.peek();
                result = Math.max(result , (i - pse-1)*nums[ind]);

            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ind = stack.pop();
            pse = stack.isEmpty()? -1 : stack.peek();
            result = Math.max(result,nums[ind]*(n - pse-1));

        }
        return result ;

    }
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        int result = Integer.MIN_VALUE;
        for(int i =0;i<m;i++){
            result = Math.max(result,calMaxArea(matrix,i,n));

        }
        return result ;


        
    }
}