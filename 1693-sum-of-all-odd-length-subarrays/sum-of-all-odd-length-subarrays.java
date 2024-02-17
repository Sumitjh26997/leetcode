class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int[] presum = new int[arr.length];

        result += arr[0];
        presum[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            result += arr[i];
            presum[i] += presum[i-1] + arr[i];
        }

        for(int i = 3; i <= presum.length; i += 2) {
            int left = 0;
            result += presum[i-1];

            for(int right = i; right < presum.length; right++) {
                result += presum[right] - presum[left];
                left++;
            }
        }

        return result;
    }
}