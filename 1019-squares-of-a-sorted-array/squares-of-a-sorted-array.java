class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;

        for(int i = n - 1; i >= 0; i--) {
            int sq;
            if(Math.abs(nums[left]) < Math.abs(nums[right])) {
                sq = nums[right];
                right--;
            } else {
                sq = nums[left];
                left++;
            }

            result[i] = sq * sq;
        }

        return result;
    }
}