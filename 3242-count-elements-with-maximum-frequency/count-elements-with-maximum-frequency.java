class Solution {
    public int maxFrequencyElements(int[] nums) {
        int result = 0, max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            max = Math.max(max, freq.get(num));
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getValue() == max)
                result += entry.getValue();
        }

        return result;
    }
}