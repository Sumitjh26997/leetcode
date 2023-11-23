class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        Map<String, Integer> hashMap = new HashMap<>();

        for( int i = 0; i < list1.length; i++ ) {
            hashMap.put(list1[i], i);
        }

        for ( int i = 0; i < list2.length; i++) {
            if ( hashMap.containsKey(list2[i]) ) {
                if ( (hashMap.get(list2[i]) + i) == min ) {
                    min = hashMap.get(list2[i]) + i;
                    result.add(list2[i]);
                } else if ( (hashMap.get(list2[i]) + i) < min ) {
                    min = hashMap.get(list2[i]) + i;
                    result.clear();
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}