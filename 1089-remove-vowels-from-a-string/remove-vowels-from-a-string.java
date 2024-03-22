class Solution {
    public boolean checkVowel(char q) {
        String vowels = "aeiou";
        if(vowels.indexOf(q) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public String removeVowels(String s) {
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(!checkVowel(s.charAt(i))) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}