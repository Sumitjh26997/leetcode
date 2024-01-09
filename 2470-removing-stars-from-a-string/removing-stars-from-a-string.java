class Solution {
    public String removeStars(String s) {
        Stack<Character> sChars = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                sChars.pop();
            } else {
                sChars.push(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder("");
        
        while(!sChars.isEmpty()) {
            result.append(sChars.pop());
        }

        return result.reverse().toString();
    }
}