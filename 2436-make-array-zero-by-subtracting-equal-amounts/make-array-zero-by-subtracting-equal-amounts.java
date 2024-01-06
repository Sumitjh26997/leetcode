class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        int n = nums.length;
        while(true) {
            int min = Integer.MAX_VALUE;
            int flag = 0;

            for(int i = 0; i < n; i++) {
                if(nums[i] == 0) {
                    flag++;
                    continue;
                }
                if(nums[i] < min) {
                    min = nums[i];
                }
            }

            if(flag == n) {
                break;
            }

            for(int i = 0; i < n; i++) {
                if(nums[i] != 0) {
                    nums[i] -= min;
                }
            }
            count++;
        }

        return count;
    }   
}