class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i,j;
        for(i = 0; i < matrix.length - 1; i++) {
            if(target >= matrix[i][0] && target < matrix[i+1][0]) {
                break;
            }
        }
        
        for(j = 0; j < matrix[0].length; j++) {
            if(target == matrix[i][j])
                return true;
        }
        
        return false;
    }
}