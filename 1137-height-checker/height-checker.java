class Solution {
    public int heightChecker(int[] heights) {
        //bubble sort
        int count = 0;
        int[] expected = Arrays.copyOf(heights, heights.length);;
        boolean hasSwapped = true;
        while(hasSwapped) {
            hasSwapped = false;
            for(int i = 0; i < expected.length - 1; i++) {
                if(expected[i] > expected[i+1]) {
                    int temp = expected[i];
                    expected[i] = expected[i+1];
                    expected[i+1] = temp;
                    hasSwapped = true;
                }
            }
        }

        for(int j=0; j<heights.length; j++) {
            if(expected[j] != heights[j])
                count++;
        }

        return count;
    }
}