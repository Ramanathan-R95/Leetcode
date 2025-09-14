/**
 * @param {number[]} nums
 * @param {number} threshold
 * @return {number}
 */
function checkSum(nums,d){
    let res = 0;
    for(let j of nums){
        res+=Math.ceil(j/d);
    }
    return res;
}
var smallestDivisor = function(nums, threshold) {
    let low = 1;
    let high = nums.reduce((max ,cur)=>{
        if(cur > max) return cur;
        return max;
        
    });
    let mid ;
    let res = Number.MAX_SAFE_INTEGER;
    while(low <= high){
        mid = Math.floor((low + high ) / 2 );
        if(checkSum(nums,mid)<= threshold){
            res = Math.min(res,mid);
            high = mid - 1;
        }
        else low = mid + 1;
    }
    return res;

    
};