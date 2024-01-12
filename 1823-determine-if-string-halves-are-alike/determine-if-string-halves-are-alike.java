class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        char[] st = s.toCharArray();
        int i = 0, j = s.length()-1;
        int rVowel = 0, lVowel = 0;

        while (i < j) {
            if(vowels.indexOf(st[i]) != -1) {
                lVowel++;
            }
            if(vowels.indexOf(st[j]) != -1) {
                rVowel++;
            }

            i++;
            j--;
        }

        return lVowel == rVowel;
    }
}