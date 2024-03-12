class Solution {
    public static final char empty = '.';
    public static final char wall = '+';

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        
        int[][] directions = new int[][] {{-1,0},{1,0},{0,-1},{0,1}};
        Queue<int[]> bfsQueue = new LinkedList<>();

        int startRow = entrance[0], startCol = entrance[1];
        bfsQueue.offer(new int[] {startRow, startCol, 0});
        maze[startRow][startCol] = wall;
        while(!bfsQueue.isEmpty()) {
            int[] curr = bfsQueue.poll();

            if((curr[0] == 0 || curr[0] == m - 1 || curr[1] == 0 || curr[1] == n - 1) && curr[2] != 0) {
                return curr[2];
            }

            for(int[] dir : directions) {
                int newRow = curr[0] + dir[0];
                int newCol = curr[1] + dir[1];
                

                if((newRow >= 0 && newRow <= m - 1) && (newCol >= 0 && newCol <= n - 1) && maze[newRow][newCol] == empty) {
                    bfsQueue.offer(new int[] {newRow, newCol, curr[2]+1});
                    maze[newRow][newCol] = '+';
                }
            }
        }



        return -1;
    }
}