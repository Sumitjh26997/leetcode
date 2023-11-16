class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        int max = 0;

        for( int i = 0; i < accounts.length; i++ ) {
            for(int j = 0; j< accounts[i].length; j++) {
                wealth[i] += accounts[i][j]; 
            }
        }

        for( int i = 0; i < wealth.length; i++ ) {
            max = (wealth[i] > max) ? wealth[i] : max;
        }
        
        return max;
    }
}