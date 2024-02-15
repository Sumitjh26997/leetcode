class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1, sum = 0, left = 0;

        for(int num : nums) {
            sum += num;
        }

        for(int i = 0; i < nums.length; i++) {
            if(left == sum - left - nums[i]) {
                pivot = i;
                break;
            }

            left += nums[i];
        }

        return pivot;
    }
}