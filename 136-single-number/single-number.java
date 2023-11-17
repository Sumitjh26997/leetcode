class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> numCount = new HashMap<Integer, Integer>();
        for ( int i = 0; i < nums.length; i++ ) {
            if (numCount.containsKey(nums[i])) {
                numCount.put( nums[i], numCount.get(nums[i]) + 1 );
            } else {
                numCount.put( nums[i], 1 );
            }
        }

        for ( Map.Entry num : numCount.entrySet() ) {
            if ( (int) num.getValue() == 1) {
                result = (int) num.getKey();
                break;
            }
        }

        return result;
    }
}