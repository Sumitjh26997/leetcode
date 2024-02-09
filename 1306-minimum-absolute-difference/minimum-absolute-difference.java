class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int st = 0, end = 1, min = arr[1] - arr[0];

        for(int i = 2; i < arr.length; i++) {
            if((arr[i] - arr[i-1]) < min) {
                result.clear();
                min = arr[i] - arr[i-1];
                st = i - 1;
                end = i;
            } else if ((arr[i] - arr[i-1]) == min) {
                List<Integer> subresult = new ArrayList<>();
                subresult.add(arr[st]);
                subresult.add(arr[end]);
                result.add(subresult);
                st = i - 1;
                end = i;
            }
        }

        List<Integer> subresult = new ArrayList<>();
        subresult.add(arr[st]);
        subresult.add(arr[end]);
        result.add(subresult);

        return result;
    }
}