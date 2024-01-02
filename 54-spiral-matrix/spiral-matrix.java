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
                System.out.print(matrix[top][i] + " ");
                traversal.add(matrix[top][i]);
            }
            System.out.println();

            top++;

            //top to bottom
            for(int j = top; j <= bottom; j++) {
                System.out.print(matrix[j][right] + " ");
                traversal.add(matrix[j][right]);
            }
            System.out.println();

            right--;

            //right to left
            if(top <= bottom){
                
                for(int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                    traversal.add(matrix[bottom][i]);
                }
                System.out.println();

                bottom--;
            }
                

            if(left <= right) {
                //bottom to top
                for(int j = bottom; j >= top; j--) {
                    System.out.print(matrix[j][left] + " ");
                    traversal.add(matrix[j][left]);
                }
                System.out.println();

                left++;
            }
            

            System.out.println("top: " + top + " left : " + left + " right: " + right + " bottom: " + bottom);
        }
        
        return traversal;
    }
}