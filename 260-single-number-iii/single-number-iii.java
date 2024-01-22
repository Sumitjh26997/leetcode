class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int i = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if(entry.getValue() == 1) {
                result[i] = entry.getKey();
                i++;
            }
        }

        return result;
    }
}