class Solution {
    public boolean wordPattern(String pattern, String s) {

        //get words of string S in an array
        String words[] = s.split(" ");

        // if length of pattern not equal to no. of words;
        if(pattern.length() != words.length) {
            return false;
        } 

        // maintain hashMap to store mapping between characters of both strings
        Map<Character, String> hashMap = new HashMap<>();

        for( int i = 0; i < pattern.length(); i++ ) {
            // if key exists and value doesn't match with current entry : return false
            if ( hashMap.containsKey(pattern.charAt(i)) && hashMap.get(pattern.charAt(i)).compareTo(words[i]) != 0 ) {
               System.out.println("key: "+ hashMap.get(pattern.charAt(i)) + "value: " + words[i]);
               return false;  
            } else if ( !hashMap.containsKey(pattern.charAt(i)) && hashMap.containsValue(words[i]) ) {
                // if key doesn't exist but value's mapping with other key already exists : return false
                return false;
            } else {
                // if key is missing add new entry
                hashMap.put( pattern.charAt(i), words[i] );
            }
        }

        return true;
    }
}