class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        
        for(int i = 0; i < matrix.length; i++) {
            int low = 0;
            int high = matrix[0].length - 1;

            while(low <= high) {
                int mid = low + (high - low);
                if(target == matrix[i][mid]) {
                    found = true;
                    break;
                } else if (target > matrix[i][mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if(found)
                break;
        }

        return found;
    }
}