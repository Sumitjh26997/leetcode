class Solution {
    public int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        
        while(left < right) {
            // System.out.println("1s: " + s);
            if(s.charAt(left) != s.charAt(right)) {
                break;
            }

            // System.out.println("2s: " + s); 
            char c = s.charAt(left);
            while(left <= right && c == s.charAt(left)) {
                left++;
            }

            while(right > left && c == s.charAt(right)) {
                right--;
            }


            // System.out.println("left : " + left + " right :" + right);
            s = s.substring(left, right+1);
            // System.out.println("3s: " + s);
            left = 0;
            right = s.length() - 1;
        }

        return s.length();
    }
}