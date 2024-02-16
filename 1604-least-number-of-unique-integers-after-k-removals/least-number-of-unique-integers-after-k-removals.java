class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> unique = new HashMap<>();
        int result = 0;

        for(int num : arr) {
            unique.put(num, unique.getOrDefault(num, 0) + 1);
        }

        List<Integer> freq = new ArrayList<>(unique.values());
        Collections.sort(freq);

        for(int i = 0; i < freq.size(); i++) {
            result += freq.get(i);
            if(result > k) {
                return freq.size() - i;
            }
        }

        return 0;
    }
}