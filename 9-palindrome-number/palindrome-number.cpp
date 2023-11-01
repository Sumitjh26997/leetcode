class Solution {
public:
    bool isPalindrome(int x) {
        int num = x;
        long reverse_x = 0;

        while(num>0) {
            reverse_x = reverse_x*10 + (num%10);
            num = num/10;
        }

        if (x == static_cast<int>(reverse_x))
            return true;
        
        return false;
    }
};