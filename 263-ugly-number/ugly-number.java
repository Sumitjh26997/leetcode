class Solution {
    public boolean isUgly(int n) {
        if(n == 0) {
            return false;
        }

        int[] factors = {2, 3, 5};
        for(int i = 0; i < factors.length; ) {
            if(n % factors[i] == 0) {
                n /= factors[i];
            } else {
                i++;
            }
        }

        if(n == 1) {
            return true;
        }
        return false;
    }
}