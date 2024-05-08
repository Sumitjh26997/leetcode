class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        HashMap<Integer, Integer> position = new HashMap<>();

        for(int i = 0; i < score.length; i++) {
            position.put(score[i], i);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int s : score) {
            maxHeap.add(s);
        }

        int counter = 1;
        while(!maxHeap.isEmpty()) {
            if(counter == 1) {
                answer[position.get(maxHeap.poll())] = "Gold Medal";
            } else if(counter == 2) {
                answer[position.get(maxHeap.poll())] = "Silver Medal";
            } else if(counter == 3) {
                answer[position.get(maxHeap.poll())] = "Bronze Medal";
            } else {
                answer[position.get(maxHeap.poll())] = String.valueOf(counter);
            }
            counter++;
        }

        return answer;
    }
}