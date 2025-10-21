/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    const dat = await Promise.all([promise1,promise2]);
    const res = dat.reduce((sum,cur)=>{
        return sum + cur ;
    }, 0);
    return res;
   
    
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */