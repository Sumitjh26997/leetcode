
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Pair<Integer,String>> pq = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());

        for(int i = 0; i < names.length; i++) {
            pq.add(new Pair<>(heights[i], names[i]));
        }

        String[] result = new String[names.length];
        int j = 0;
        while(!pq.isEmpty()) {
            result[j] = pq.poll().getValue();
            j++;
        }

        return result;
    }
}