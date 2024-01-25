class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) {
            return new ArrayList<>();
        }
        List<String> ranges = new ArrayList<>();
        int rangeStart = nums[0], rangeEnd = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1] + 1) {
                rangeEnd = nums[i];
            } else {
                if(rangeStart == rangeEnd) {
                    ranges.add(String.valueOf(rangeStart));
                } else {
                    ranges.add(String.valueOf(rangeStart) + "->" + String.valueOf(rangeEnd));
                }
                rangeStart = nums[i];
                rangeEnd = nums[i];
            }
        }

        if(rangeStart == rangeEnd) {
            ranges.add(String.valueOf(rangeStart));
        } else {
            ranges.add(String.valueOf(rangeStart) + "->" + String.valueOf(rangeEnd));
        }

        return ranges;
    }
}