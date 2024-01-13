class Solution {
    public int minSteps(String s, String t) {
        int minSteps = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : tMap.entrySet()) {
            if(sMap.containsKey(entry.getKey())) {
                minSteps += Math.max(0, (entry.getValue() - sMap.get(entry.getKey())));
            } else {
                minSteps += entry.getValue();
            }
        }

        return minSteps;
    }
}