class Solution {


    public String reversePrefix(String word, char ch) {
        // get index of first occurrence of character in string
        int index = word.indexOf(ch);
        
        // if ch doesn't exist in word return original string
        if(index == -1) {
            return word;
        }

        StringBuilder result = new StringBuilder();

        //append beginning of string to first occurrence of ch to result and reverse
        result.append(word.substring(0,index + 1));
        result.reverse();
        
        //append rest of the string to result
        result.append(word.substring(index + 1));
        
        return result.toString();
    }
}