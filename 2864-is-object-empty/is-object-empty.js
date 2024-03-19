/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = (obj) => {
    // console.log(Object.keys(obj));
    return Object.keys(obj).length === 0;
};