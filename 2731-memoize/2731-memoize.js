/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    let tab ={};
    let callCount=0;

    
    return function(...args) {
        callVal = [...args];
        if(tab[callVal]!== undefined) return tab[callVal];
        res = fn(...callVal);
        callCount+=1;
        tab[callVal] = res ;
        return res;



        
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */