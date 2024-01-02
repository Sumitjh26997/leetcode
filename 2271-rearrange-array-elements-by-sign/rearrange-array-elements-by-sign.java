class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int k = 0;

        //add positive numbers in even indices
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result[k] = nums[i];
                k += 2;
            }
        }

        k = 1;
        //add negative numbers in odd indices
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                result[k] = nums[i];
                k += 2;
            }
        }

        return result;
    }
}