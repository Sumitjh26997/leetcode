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
            if(rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if(rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            } 
        }
    }

    public int getComponents() {
        int count = 0;

        for(int i = 0; i < root.length; i++) {
            if(root[i] == i) {
                count++;
            }
        }

        return count;
    }
}




class Solution {
    public int countComponents(int n, int[][] edges) {
        UnionFind uf = new UnionFind(n);

        for(int[] edge: edges) {
            uf.union(edge[0], edge[1]);
        }

        return uf.getComponents(); 
    }
}