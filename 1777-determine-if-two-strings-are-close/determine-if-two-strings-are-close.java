class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> w1Freq = new HashMap<>();
        HashMap<Character, Integer> w2Freq = new HashMap<>();

        for(char c : word1.toCharArray()) {
            w1Freq.put(c, w1Freq.getOrDefault(c, 0) + 1);
        }

        for(char c : word2.toCharArray()) {
            w2Freq.put(c, w2Freq.getOrDefault(c, 0) + 1);
        }

        if(!w1Freq.keySet().equals(w2Freq.keySet())) {
            return false;
        }

        List<Integer> w1Frequency = new ArrayList<>(w1Freq.values());
        List<Integer> w2Frequency = new ArrayList<>(w2Freq.values());
        Collections.sort(w1Frequency);
        Collections.sort(w2Frequency);
        return w1Frequency.equals(w2Frequency);
    }
}