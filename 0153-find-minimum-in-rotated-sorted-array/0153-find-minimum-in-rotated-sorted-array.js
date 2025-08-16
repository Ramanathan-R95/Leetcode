/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    let start = 0;
    let end = nums.length - 1;
    let min = Number.MAX_SAFE_INTEGER;
    while(start <= end){
        let mid = parseInt((start + end) / 2);
        min = Math.min(min,nums[mid]);
        if(nums[mid] >= nums[start] ){
            min = Math.min(min,nums[start]);
            start = mid +1;
        }
        else end = mid -1;
    }
    return min;
    
};