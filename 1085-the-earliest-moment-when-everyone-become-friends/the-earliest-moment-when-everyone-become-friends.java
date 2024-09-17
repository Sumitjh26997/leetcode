class UnionFind{
    int[] root;
    int[] rank;

    public UnionFind(int size) {
        root = new int[size];
        rank = new int[size];

        for(int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {
        if(x == root[x]) {
            return x;
        }

        return root[x] = find(root[x]);
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if(rootX != rootY) {
            if(rank[rootX] > rootY) {
                root[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public int getComponents() {
        int count = 0;
        
        for(int i = 0; i < root.length; i++) {
            if(root[i] == i)
                count++;
        }
        return count;
    }
}

class Solution {
    public int earliestAcq(int[][] logs, int n) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> {
            return a[0] - b[0];
        });

        UnionFind uf = new UnionFind(n);

        for(int[] log : logs) {
            minHeap.add(log);
        }

        while(!minHeap.isEmpty()) {
            int[] log = minHeap.poll();
            uf.union(log[1], log[2]);
            if(uf.getComponents() == 1) {
                return log[0];
            }
        }

        return -1;       
    }
}