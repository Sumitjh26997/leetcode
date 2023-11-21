class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if length not equal return false;
        if(s.length() != t.length()) {
            return false;
        } 

        // maintain 2 hash maps to store character and occurrence for both strings
        Map<Character, Character> hashMap = new HashMap<>();
        // Map<Character, Integer> tMap = new HashMap<>();

        // populate hashmap with character as key and count of occurrence for each string
        for( int i = 0; i < s.length(); i++ ) {
            // if key exists increment count
            if ( hashMap.containsKey(s.charAt(i)) && hashMap.get(s.charAt(i)) != t.charAt(i) ) {
               return false; 
            } else if ( !hashMap.containsKey(s.charAt(i)) && hashMap.containsValue(t.charAt(i))) {
                return false;
            } else {
                // if key is missing add new entry
                hashMap.put( s.charAt(i), t.charAt(i) );
            }
        }

        // for( int i = 0; i < t.length(); i++ ) {
        //     if ( tMap.containsKey(t.charAt(i)) ) {
        //         tMap.put( t.charAt(i), tMap.get(t.charAt(i)) + 1 );
        //     } else {
        //         tMap.put( t.charAt(i), 1 );
        //     }
        // }

        // Iterator<Map.Entry<Character, Integer>> sIterator = sMap.entrySet().iterator();
        // Iterator<Map.Entry<Character, Integer>> tIterator = tMap.entrySet().iterator();

        // while(sIterator.hasNext() && tIterator.hasNext()) {
        //     Map.Entry<Character, Integer> sEntry = sIterator.next();
        //     Map.Entry<Character, Integer> tEntry = tIterator.next();
        //     if( sEntry.getValue() != tEntry.getValue() ) 
        //         return false;
        // }


        return true;
    }
}