class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> traversal = new ArrayList<>();
        
        int height = matrix.length;
        int width = matrix[0].length;

        int top = 0;
        int left = 0;
        int right = width - 1;
        int bottom = height - 1;
        
        while(top <= bottom && left <= right) {
            
            //left to right
            for(int i = left; i <= right; i++) {
                traversal.add(matrix[top][i]);
            }

            top++;

            //top to bottom
            for(int j = top; j <= bottom; j++) {
                traversal.add(matrix[j][right]);
            }

            right--;

            //right to left
            if(top <= bottom){
                
                for(int i = right; i >= left; i--) {
                    traversal.add(matrix[bottom][i]);
                }

                bottom--;
            }
                

            if(left <= right) {
                //bottom to top
                for(int j = bottom; j >= top; j--) {
                    traversal.add(matrix[j][left]);
                }

                left++;
            }
        }
        
        return traversal;
    }
}