class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {        
        long result = 0;
        int turn = 0;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int h : happiness) {
            maxHeap.add(h);
        }

        for(int i = 0; i < k; i++) {
            result += Math.max(maxHeap.poll() - i, 0);
        }
       
        
        return result;
    }
}