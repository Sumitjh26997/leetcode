class Solution {
    public int countOnes(String s) {
        int ones = 0;
        for(char c : s.toCharArray()) {
            if(c == 49) {
                ones++;
            }
        }

        return ones;
    }

    public int[] countBits(int n) {
        int[] result = new int[n + 1];

        for(int i = 0; i <= n; i++) {
            result[i] = countOnes(Integer.toBinaryString(i));
        }

        return result;
    }
}