class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
    
        for ( Integer num : nums ) {
            if ( hashSet.contains(num) ) {
                hashSet.remove(num);
            } else {
                hashSet.add(num);
            }
        }

        return hashSet.stream().findFirst().get();
    }        
}