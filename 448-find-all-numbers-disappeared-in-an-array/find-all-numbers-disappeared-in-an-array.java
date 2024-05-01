class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> range = new HashSet<>();
        for(int i = 1; i <= nums.length; i++) {
            range.add(i);
        }

        for(int num : nums) {
            range.remove(num);
        }

        return new ArrayList<>(range);
    }
}