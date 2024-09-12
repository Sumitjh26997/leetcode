class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowList = new HashSet<Character>();
        for(int i = 0; i < allowed.length(); i++) {
            allowList.add(allowed.charAt(i));
        }

        int result = 0;

        for(int i = 0; i < words.length; i++) {
            boolean flag = true;
            
            for(int j = 0; j < words[i].length(); j++) {
                if(!allowList.contains(words[i].charAt(j))) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                result++;
            }
        }

        return result;
    }
}