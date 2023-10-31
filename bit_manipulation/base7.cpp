/**
 Given an integer num, return a string of its base 7 representation.

 

Example 1:

Input: num = 100
Output: "202"
Example 2:

Input: num = -7
Output: "-10"
 

Constraints:

-107 <= num <= 107
**/

class Solution {
public:
    string convertToBase7(int num) {
        if(num == 0) {
            return "0";
        }
        
        int rem, n = (num < 0) ? abs(num) : num;
        string base7_result="";

        while(n > 0) {
            rem = n%7;
            base7_result = to_string(rem) + base7_result;
            n = n/7;
        }
        
        
        return ( num < 0 ) ? ("-" + base7_result) : base7_result;
    }
};