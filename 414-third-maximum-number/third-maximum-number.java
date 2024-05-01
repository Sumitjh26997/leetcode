class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> distinctNums = new HashSet<>();

        for(int num: nums) {
            distinctNums.add(num);
        }

        List<Integer> sortedNums = new ArrayList<>(distinctNums);
        Collections.sort(sortedNums, Collections.reverseOrder());

        return sortedNums.size() < 3 ? sortedNums.get(0) : sortedNums.get(2);
    }
}