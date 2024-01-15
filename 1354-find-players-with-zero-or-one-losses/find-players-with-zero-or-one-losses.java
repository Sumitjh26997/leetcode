class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> winners = new HashSet<>();
        HashMap<Integer, Integer> losers = new HashMap<>();
        List<Integer> l0 = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        for(int i = 0; i < matches.length; i++) {
            winners.add(matches[i][0]);
            losers.put(matches[i][1], losers.getOrDefault(matches[i][1], 0) + 1);
        }

        for(int winner : winners) {
            if(!losers.containsKey(winner)) {
                l0.add(winner);
            }
        }

        for(Map.Entry<Integer, Integer> loser : losers.entrySet()) {
            if(loser.getValue() == 1) {
                l1.add(loser.getKey());
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(l0);
        result.add(l1);
        Collections.sort(result.get(0));
        Collections.sort(result.get(1));
        return result;
    }
}