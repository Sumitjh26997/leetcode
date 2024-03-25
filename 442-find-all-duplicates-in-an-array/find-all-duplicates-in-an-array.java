class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> uniques = new HashSet<>();

        for(int num : nums) {
            if(uniques.contains(num)) {
                duplicates.add(num);
            } else {
                uniques.add(num);
            }
        }

        return duplicates;
    }
}