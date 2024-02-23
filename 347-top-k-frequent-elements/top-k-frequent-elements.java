class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int result[] = new int[k];
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((n1, n2) -> freqMap.get(n2) - freqMap.get(n1));

        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(int n : freqMap.keySet()) {
           maxHeap.add(n); 
        }

        for(int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}