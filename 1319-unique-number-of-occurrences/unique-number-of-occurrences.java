class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        HashSet<Integer> unique = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            occurrences.put(arr[i], occurrences.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if(unique.contains(entry.getValue())) {
                return false;
            }
            unique.add(entry.getValue());
        }

        return true;
    }
}