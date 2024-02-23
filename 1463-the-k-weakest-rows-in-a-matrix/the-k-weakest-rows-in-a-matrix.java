class Solution {
    public int getLocation(int[] row) {
        if(row[0] == 0) {
            return -1;
        }
        int result = 0;
        int left = 0, right = row.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(row[mid] == 1) {
                result = mid;
                left = mid + 1;
            } else if(row[mid] == 0) {
                right = mid - 1;
            }
        }

        return result;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> {
        if(a[0] == b[0]) return a[1] - b[1];
        else return a[0] - b[0];});

        for(int i = 0; i < mat.length; i++) {
            int z = getLocation(mat[i]);
            minHeap.add(new int[]{z, i});
        }

        for(int i = 0; i < k; i++) {
            int[] p = minHeap.poll();
            result[i] = p[1];
        }

        return result;
    }
}