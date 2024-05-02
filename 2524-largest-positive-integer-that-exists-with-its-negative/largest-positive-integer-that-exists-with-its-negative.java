class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;

        while(left < right) {
            if(nums[left]*-1 == nums[right]) {
                // System.out.println()
                return nums[right];
            } else if (nums[left] * -1 > nums[right]) {
                left++;
            } else {
                right--;
            }
        }

        return -1;
    }
}