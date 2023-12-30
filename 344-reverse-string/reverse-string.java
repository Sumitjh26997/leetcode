class Solution {
    private static void helper(int index, char[]s){
        if(index >= s.length/2) {
            return;
        }
        helper(index + 1, s);
        char temp = s[index];
        s[index] = s[s.length - 1 - index];
        s[s.length - 1 - index] = temp;
    }

    public void reverseString(char[] s) {
        helper(0, s);
    }
}