class Solution {
    public void moveZeroes(int[] nums) {
       int i = 0, count = 0;
       for(int j = 0; j < nums.length; j++) {
           if(nums[j] != 0){
               nums[i] = nums[j];
               i++;
           } else {
               count++;
           }
       } 
       for(int j = nums.length - 1; j >= 0; j--) {
           if(j == (nums.length - 1 - count)) {
               break;
           }
           nums[j] = 0;
       }
    }
}