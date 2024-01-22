class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}