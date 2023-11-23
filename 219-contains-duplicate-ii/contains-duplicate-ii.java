class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        Map<Integer, Integer> numMap = new HashMap<>();

        // store first occurrence and corresponding index of num in HashMap
        for ( int i = 0; i < nums.length; i++ ) {
            numMap.putIfAbsent(nums[i], i);
        }

        // iterate over array, if key match is found compare indices to check if difference is under target k
        for ( int i = 0; i < nums.length; i++ ) {
            if ( numMap.containsKey(nums[i]) && numMap.get(nums[i]) != i ) {
                if ( Math.abs(i - numMap.get(nums[i])) <= k) {
                    return true;
                } else {
                    numMap.put(nums[i], i);
                }
            }
        }

        return flag;
    }
}