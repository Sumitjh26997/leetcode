class Solution {


    public String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder();

        int index = word.indexOf(ch);
        
        if(index == -1) {
            return word;
        }

        result.append(word.substring(0,index + 1));
        result.reverse();
        result.append(word.substring(index + 1));

        // return result.toString();
        // int i = 0;
        // while(word.charAt(i) != ch) {
        //     result.append(word.charAt(i));
        //     i++;
        // }

        // result.append(word.charAt(i));

        // result.reverse();

        // for(; i < word.length(); i++) {
        //     result.append(word.charAt(i));
        // }

        return result.toString();
    }
}