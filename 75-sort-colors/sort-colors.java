class Solution {
    public void sortColors(int[] nums) {
        //selection sort
        int min_index;

        for( int i = 0; i < nums.length; i++ ) {
            min_index = i;
            for(int j = i+1; j < nums.length; j++ ) {
                if( nums[j] < nums[min_index] ) {
                    min_index = j;
                }
            }

            int temp = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = temp;
        }
    }
}