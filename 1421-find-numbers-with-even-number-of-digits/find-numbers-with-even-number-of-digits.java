class Solution {
    public int evenDigits(int num) {
        int digits = 0;
        while(num > 0) {
            digits ++;
            num = num/10;
        }

        return digits % 2 == 0 ? 1 : 0;
    }

    public int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums) {
            count += evenDigits(num);
        }

        return count;
    }
}