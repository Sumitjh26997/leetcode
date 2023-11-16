class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, dist = 0;
        
        for(int i = 0; i < gain.length; i++) {
            dist += gain[i];
            max = dist > max ? dist : max;
        }

        return max;
    }
}