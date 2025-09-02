/**
 * @param {number[][]} mat
 * @return {number[]}
 */
var rowAndMaximumOnes = function(mat) {
    let res = [-1,-1] ;
    let i = 0 , j = 0;
    let n = mat.length;
    let m = mat[0].length;
    for( i=0 ; i < n ; i++){
        let c = 0;
        for (j = 0 ; j < m ; j++ ){
            if (mat[i][j] == 1){
                c++;
            }
        }
        if(c > res[1]) {
            res[1] = c ;
            res[0] = i;
        }
    }
    return res;
     
    
};