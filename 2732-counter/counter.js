/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let count = 1;
    let counter = n;
    return function() {
        if(count == 1) {
            count++;
            return  counter;
        }
        count++;
        return counter += 1;
    };

};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */