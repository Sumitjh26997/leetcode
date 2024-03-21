/**
 * @param {string} val
 * @return {Object}
 */
const expect = function(val) {
    val = val;

    const toBe = (val2) => {
        if(val === val2) return true;
        throw new Error("Not Equal");
    }

    const notToBe = (val2) => {
        if(val !== val2) return true;
        throw new Error("Equal");
    }

    return {
        toBe: toBe,
        notToBe: notToBe
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */