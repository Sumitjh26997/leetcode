class Solution {
    public int getMinPosition(int[] nums) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < nums[pos]) {
                pos = i;
            }
        }

        return pos;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0; i < k; i++) {
            int pos = getMinPosition(nums);
            nums[pos] = nums[pos] * multiplier;
        }

        return nums;
    }
}