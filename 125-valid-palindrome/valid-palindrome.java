class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder text = new StringBuilder();

       for(char c : s.toCharArray()) {
           if((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
               text.append(Character.toLowerCase(c));
           }
       }

       return text.toString().equals(text.reverse().toString()); 
    }
}