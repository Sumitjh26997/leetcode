class Solution {
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while(i < j) {
            if(isVowel(str[i]) && isVowel(str[j])) {
                char c = str[i];
                str[i] = str[j];
                str[j] = c;
                i++;
                j--;
            }
            if(!isVowel(str[i])) {
                i++;
            }
            if(!isVowel(str[j])) {
                j--;
            }
        }


        return String.valueOf(str);
    }
}