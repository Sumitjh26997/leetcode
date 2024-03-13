class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> rowMap = new HashMap<>();

        for(int i = 0; i < grid.length; i++) {
            StringBuilder row = new StringBuilder();
            for(int j = 0; j < grid[0].length; j++) {
                row.append(grid[i][j]+',');
            }
            rowMap.put(row.toString(), rowMap.getOrDefault(row.toString(), 0) + 1);
        }

        int pairs = 0;
        for(int j = 0; j < grid[0].length; j++) {
            StringBuilder column = new StringBuilder();
            for(int i = 0; i < grid.length; i++) {
                column.append(grid[i][j]+',');
            }
            if(rowMap.containsKey(column.toString())) {
                pairs += rowMap.get(column.toString());
            }
        }
        
        return pairs;
    }
}