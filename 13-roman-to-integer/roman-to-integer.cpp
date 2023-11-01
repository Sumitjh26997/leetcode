#include <unordered_map>

class Solution {
public:
    void initialize_map(unordered_map<char, int> &roman_values) {
        roman_values = {
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000}
        };
    }


    int romanToInt(string s) {
        int num = 0;
        unordered_map<char, int> roman_values;
        initialize_map(roman_values);

        for(int i=0; i<s.length(); i++) {
            if (roman_values[s[i]] < roman_values[s[i+1]]) {
                num -= roman_values[s[i]];
            } else {
                num += roman_values[s[i]];
            }
        }
        return num;
    }
};