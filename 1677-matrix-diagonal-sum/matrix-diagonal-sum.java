class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < n; i++) {
            //even-odd check
            if(n%2 != 0 && i == n/2) {
                // primary diagonal, skip secondary
                sum += mat[i][i];
                continue;
            }
            // primary diagonal
            sum += mat[i][i];
            // secondary diagonal
            sum += mat[i][n-i-1];
        }

        return sum;
    }
}