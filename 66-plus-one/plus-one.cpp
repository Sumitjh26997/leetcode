class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        if(digits[digits.size() - 1] < 9) {
            digits[digits.size() - 1]++;
            return digits;
        } else {
            digits[digits.size() - 1] = 0;
            int carry = 1;
            for(int i=(digits.size() - 2); i>=0; i--) {
                if(carry == 1 && digits[i] < 9) {
                    digits[i]++;
                    carry = 0;
                } else if(carry == 1 && digits[i] == 9) {
                    digits[i] = 0;
                    carry = 1;
                }
            }
            if(carry == 1)
                digits.insert(digits.begin(), carry);
            
            return digits;
        }
    }
};