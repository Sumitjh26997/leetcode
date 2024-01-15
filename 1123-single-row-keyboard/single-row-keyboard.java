class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> keyMap = new HashMap<>();
        int pos = 0, result = 0;
        
        //populate position map
        for(char c : keyboard.toCharArray()) {
            keyMap.put(c, pos);
            pos++;
        }

        for(int i = 0; i < word.length(); i++) {
            if(i == 0) {
                result += keyMap.get(word.charAt(i));
            } else {
                result += Math.abs(keyMap.get(word.charAt(i - 1)) - keyMap.get(word.charAt(i)));
            }
        }

        return result;
    }
}