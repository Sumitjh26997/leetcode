class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);

        StringBuilder rev = new StringBuilder();
        rev.append(num);
        rev.reverse();

        return rev.toString().equals(num);
    }
}