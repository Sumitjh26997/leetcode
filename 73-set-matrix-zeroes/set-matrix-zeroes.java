class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zeroRow = new HashSet<>();
        HashSet<Integer> zeroCol = new HashSet<>();

        for(int i = 0; i < matrix.length; i++) {
           for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    zeroRow.add(i);
                    zeroCol.add(j);
                }
           }
        }

        //set row zeroes
        for(int i : zeroRow) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }

        //set col zeroes
        for(int i : zeroCol) {
            for(int j = 0; j < matrix.length; j++) {
                matrix[j][i] = 0;
            }
        }
    }
}