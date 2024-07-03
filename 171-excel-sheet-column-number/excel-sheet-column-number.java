class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        if(columnTitle.length() == 1) {
            return (int)(columnTitle.charAt(0)) - 64;
        }

        for(int i = 0; i < columnTitle.length(); i++) {
            result += (int)(columnTitle.charAt(i)) - 64;
            if(i != columnTitle.length() - 1) {
                result *= 26;
            }
        }
        
        return result;
    }
}