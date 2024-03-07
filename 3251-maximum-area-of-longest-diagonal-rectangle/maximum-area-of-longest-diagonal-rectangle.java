class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        double longDiag = 0.0;

        for(int i = 0; i < dimensions.length; i++) {
            double diag = Math.sqrt(dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1]);
            if(diag > longDiag) {
                longDiag = diag;
                maxArea = dimensions[i][0] * dimensions[i][1];
            } else if (diag == longDiag) {
                int area = dimensions[i][0] * dimensions[i][1];
                maxArea = area > maxArea ? area : maxArea;
            }
        }

        return maxArea;
    }
}