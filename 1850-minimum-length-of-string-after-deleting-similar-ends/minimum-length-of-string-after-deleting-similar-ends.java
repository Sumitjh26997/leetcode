class Solution {
    public int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                break;
            }

            char c = s.charAt(left);
            while(left <= right && c == s.charAt(left)) {
                left++;
            }

            while(right >= left && c == s.charAt(right)) {
                right--;
            }
        }

        return right - left + 1;
    }
}