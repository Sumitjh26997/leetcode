class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        HashSet<Integer> dupes = new HashSet<>();

        for(int num : nums1) n1.add(num);
        for(int num : nums2) n2.add(num);

        for(int num : n1) {
            if(n2.contains(num)) {
                dupes.add(num);
            }
        }

        n1.removeAll(dupes);
        n2.removeAll(dupes);

        result.add(new ArrayList<>(n1));
        result.add(new ArrayList<>(n2));

        return result;
    }
}