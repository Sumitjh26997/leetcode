class Solution {
    public int minimumSum(int num) {
        int[] numArray = new int[4];

        for(int i = 0; i < 4; i++) {
            numArray[i] = num % 10;
            num = num / 10;
        }

        Arrays.sort(numArray);

        int min1 = (numArray[0] * 10 + numArray[2]) + (numArray[1] * 10 + numArray[3]);
        int min2 = (numArray[0] * 10 + numArray[3]) + (numArray[1] * 10 + numArray[2]);

        return min1 > min2 ? min2 : min1;
    }
}