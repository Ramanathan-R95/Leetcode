/**
 * @param {number[]} weights
 * @param {number} days
 * @return {number}
 */
var shipWithinDays = function(weights, days) {
    var getDays = function(weights , i,d){
        let days = 1;
        let curTotal = 0;
        for(let j of weights){
            if(curTotal + j  > i){
                days++;
                if(days > d) return false;
                curTotal = j ;
            }
            else curTotal += j ;
        }
        return true;
    };
    let left = weights.reduce((max,cur)=>{
        if(cur > max) return cur;
        return max;
    });
    let right = weights.reduce((sum,cur)=>{
        return sum + cur;
    });
    let res ;
    while (left <= right){
        let mid = Math.floor((left + right) /2 );
        if(getDays(weights,mid,days)){
            res = mid;
            right = mid - 1;


        }
        else left = mid + 1;

    }
    return res;

    
};