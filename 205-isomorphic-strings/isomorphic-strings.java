class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if length not equal return false;
        if(s.length() != t.length()) {
            return false;
        } 

        // maintain hashMap to store mapping between characters of both strings
        Map<Character, Character> hashMap = new HashMap<>();

        for( int i = 0; i < s.length(); i++ ) {
            // if key exists and current character from other string doesn't match existing entry : return false
            if ( hashMap.containsKey(s.charAt(i)) && hashMap.get(s.charAt(i)) != t.charAt(i) ) {
               return false; 
            } else if ( !hashMap.containsKey(s.charAt(i)) && hashMap.containsValue(t.charAt(i))) {
                // if key doesn't exist but value's mapping with other key already exists : return false
                return false;
            } else {
                // if key is missing add new entry
                hashMap.put( s.charAt(i), t.charAt(i) );
            }
        }

        return true;
    }
}