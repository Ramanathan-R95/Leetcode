/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
    let gasSum = gas.reduce((sum,cur)=>{
        return sum + cur ;
    }, 0);
    let costSum = cost.reduce((sum,cur)=>{
        return sum + cur ;
    }, 0);
    if(costSum > gasSum ) return -1;
    let start = 0 ;
    let fuel = 0 ;
    for (let i = 0 ; i < gas.length ; i++){
        fuel+=gas[i];
        fuel-= cost[i] ;
        if (fuel < 0 ){
            fuel = 0 ;
            start = i + 1;
        }

    }
    return start;
   
    
};