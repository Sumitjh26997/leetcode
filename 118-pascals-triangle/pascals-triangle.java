class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for( int i = 0; i < numRows; i++ ) {
            List<Integer> row = new ArrayList<Integer>();
            
            for ( int j = 0; j <= i; j++ ) {
                if( j == 0 || j == i ) {
                    // add 1 to row for first and last element
                    row.add(1);
                } else {
                    // for other elements take sum of two numbers above it
                    row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            // add row to result array
            result.add(row);
        }

        return result;
    }
}