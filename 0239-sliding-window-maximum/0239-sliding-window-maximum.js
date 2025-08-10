/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var maxSlidingWindow = function(nums, k) {
    let r = 0;
    let result = [];
    let deque=[];
    let p=0;
    for(r=0;r<nums.length;r++){
        while( deque.length && nums[deque.slice(-1)[0]] < nums[r]) {deque.pop();}
        if( deque.length && r-deque[0]+1 >k) deque.shift();
        deque.push(r);
        if(r>=k-1)
        result.push(nums[deque[0]]);
        
    }
    return result;

    
};