class Solution {
    public int connectSticks(int[] sticks) {
        if(sticks.length == 1) {
            return 0;
        }

        int cost = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for(int stick : sticks) {
            pQueue.add(stick);
        }

        while(pQueue.size() > 1) {
            int current = 0;
            int s1 = pQueue.remove();
            int s2 = pQueue.remove();

            current = s1 + s2;
            cost += current;

            pQueue.add(current);
        }

        return cost;
    }
}