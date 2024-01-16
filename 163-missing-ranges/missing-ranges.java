class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subRange = new ArrayList<>();

        if(nums.length == 0) {
            subRange.add(lower);
            subRange.add(upper);
            result.add(subRange);
            return result;
        }

        if(lower - nums[0] != 0) {
            subRange.add(lower);
            subRange.add(nums[0] - 1);
            result.add(subRange);
            subRange = new ArrayList<>();
        }

        for(int i = 1; i < nums.length; i++) {            
            subRange = new ArrayList<>();
            if(nums[i] - nums[i-1] != 1) {
                subRange.add(nums[i-1] + 1);
                subRange.add(nums[i] - 1);
                result.add(subRange);     
            }
        }

        if(upper - nums[nums.length - 1] != 0) {
            subRange = new ArrayList<>();
            subRange.add(nums[nums.length - 1] + 1);
            subRange.add(upper);
            result.add(subRange);
        }

        return result;
    }
}