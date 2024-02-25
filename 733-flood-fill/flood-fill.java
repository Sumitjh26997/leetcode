
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        if (startColor == color) return image;
        
        int m = image.length, n = image[0].length;
        Queue<int[]> pixels = new ArrayDeque<>();

        image[sr][sc] = color;
        pixels.offer(new int[]{sr, sc});

        // top, bottom, left, right
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!pixels.isEmpty()) {
            int[] pixel = pixels.poll();
            int r = pixel[0], c = pixel[1];

            for(int[] dir : directions) {
                int newR = r + dir[0], newC = c + dir[1];
                if(newR >= 0 && newR < m && newC >= 0 && newC < n && image[newR][newC] == startColor) {
                    image[newR][newC] = color;
                    pixels.offer(new int[]{newR, newC});
                }
            }
        }

        return image; 
    }
}