class Solution {
    public boolean isArmstrong(int n) {
        int num = n, result = 0;
        int power = Integer.toString(n).length();
        while(num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, power);
            num /= 10;
        }

        return result == n;
    }
};