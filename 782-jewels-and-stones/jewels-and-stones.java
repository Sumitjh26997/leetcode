class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        HashMap<Character, Integer> jewel = new HashMap<>();
        HashMap<Character, Integer> stone = new HashMap<>();

        for(int i = 0; i < jewels.length(); i++) {
            jewel.put(jewels.charAt(i), jewel.getOrDefault(jewels.charAt(i), 0) + 1);
        }

        for(int i = 0; i < stones.length(); i++) {
            stone.put(stones.charAt(i), stone.getOrDefault(stones.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : stone.entrySet()) {
            if(jewel.containsKey(entry.getKey())) {
                result += entry.getValue();
            }
        }

        return result;
    }
}