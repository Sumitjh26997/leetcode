class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> indices = new HashMap<>();

        for(int i = 0; i < nums2.length; i++){
            indices.put(nums2[i], i);
        }

        for(int i = 0; i < nums1.length; i++){
            result[i] = indices.get(nums1[i]);
        }

        return result;
    }
}