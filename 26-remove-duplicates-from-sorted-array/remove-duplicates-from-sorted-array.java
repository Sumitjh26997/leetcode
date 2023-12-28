class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int curr = nums[0];
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != curr) {
                nums[i] = nums[j];
                curr = nums[j];
                i++;
            }
        }
        return i;
    }
}