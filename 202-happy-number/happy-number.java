class Solution {
    
    private int nextn( int num ) {
        int n = num;
        int digit, result = 0;

        while(n > 0) {
            digit = n%10;
            n = n/10;
            result += digit * digit;
        }

        return result;
    }

    public boolean isHappy(int n) {
        Set<Integer> hashSet = new HashSet<>();

        while ( n != 1 && !hashSet.contains(n)) {
            hashSet.add(n);
            n = nextn(n);
        }

        return n == 1;    
    }
}