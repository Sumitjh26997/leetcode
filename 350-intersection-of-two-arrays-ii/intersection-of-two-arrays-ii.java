class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for ( int i = 0; i < nums1.length; i++ ) {
            countMap.put(nums1[i], countMap.getOrDefault(nums1[i], 0) + 1);
        }

        for ( int i = 0; i < nums2.length; i++ ) {
            if ( countMap.containsKey(nums2[i]) && countMap.get(nums2[i]) != 0) {
                result.add(nums2[i]);
                countMap.put(nums2[i], countMap.get(nums2[i]) - 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}