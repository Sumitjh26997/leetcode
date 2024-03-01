class Solution {
    public int maxOperations(int[] nums, int k) {
        int pairs = 0;
        int left = 0, right = nums.length - 1;
        Arrays.sort(nums);

        while(left < right) {
            if(nums[left] + nums[right] == k) {
                pairs++;
                left++;
                right--;
            } else if(nums[left] + nums[right] < k) {
                left++;
            } else {
                right--;
            }
        }

        return pairs;
    }
}