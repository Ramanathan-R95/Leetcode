class Solution {
    public int calArea(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int result = Integer.MIN_VALUE;
        int ind,pse ;
        for(int i=0; i<nums.length ;i++){
            while(!stack.isEmpty() && nums[i] <= nums[stack.peek()]){
                ind = stack.pop();
                pse = stack.isEmpty()? -1: stack.peek();
                result = Math.max(result,nums[ind]*(i - pse- 1));




            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ind = stack.pop();
            pse = stack.isEmpty()? -1: stack.peek();
            result = Math.max(result,nums[ind]*(nums.length - pse- 1));



        }
        return result;

    }
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ps = new int[m][n];
        int result = Integer.MIN_VALUE;
        for (int i = 0 ; i < n ; i++)
            ps[0][i] = matrix[0][i] == '1' ? 1: 0 ;
        for (int i = 0 ; i < n ; i++){
            for(int j = 1 ;j<m;j++){
                if(matrix[j][i] == '0')
                    ps[j][i] = 0;
                else 
                    ps[j][i] = ps[j-1][i] + 1 ;

            }

        }
        for(int i=0;i<m;i++){
            result = Math.max(result,calArea(ps[i]));
        }
        return result;
        
    }
}