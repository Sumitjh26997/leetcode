class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++) {
            StringBuilder rev = new StringBuilder(words[i]);
            if(rev.toString().equals(rev.reverse().toString())) {
                return rev.toString();
            }
        }

        return "";
    }
}