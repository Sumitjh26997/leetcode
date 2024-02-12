class Solution {
    public int[][] kClosest(int[][] points, int k) {
       int[][] closest = new int[k][2];
       int[] distances = new int[points.length];
       int j = 0;
       
       for(int i = 0; i < points.length; i++) {
           distances[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
       }

       int sortedDistances[] = new int[points.length];
       System.arraycopy(distances, 0, sortedDistances, 0, points.length);
       Arrays.sort(sortedDistances);

       for(int i = 0; i < points.length; i++) {
           if(distances[i] <= sortedDistances[k-1]) {
               closest[j++] = points[i];
            }
       }

       return closest;
    }
}