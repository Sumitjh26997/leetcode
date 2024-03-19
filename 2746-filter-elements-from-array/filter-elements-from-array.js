/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let result = [];
    for(let i = 0; i < arr.length; i++) {
        let res = fn(arr[i], i);
        if(res) {
            result.push(arr[i]);
        }
    }

    return result;
};