class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        String[] parts = str.split(" ");

        return parts[parts.length - 1].length();
    }
}