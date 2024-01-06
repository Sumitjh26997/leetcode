class UnionFind {
    private int[] root;

    public UnionFind(int size) {
        root = new int[size];
        for(int i = 0; i < size; i++)
            root[i] = i;
    }

    public void printRoot() {
        for(int i = 0; i < root.length; i++)
            System.out.println("root of " + i + " : " + root[i]);
    }

    public int find(int x) {
        return root[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if(rootX != rootY) {
            for(int i = 0; i< root.length; i++) {
                if(root[i] == rootY)
                    root[i] = rootX;
            }
        }
    }

    public int getDistinct() {
        HashSet<Integer> distinct = new HashSet<>();

        for(int i = 0; i < root.length; i++)
            distinct.add(root[i]);

        return distinct.size();
    }
}

class Solution {
    
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        UnionFind uf = new UnionFind(n);

        for(int i = 0; i < n - 1; i++) {
            for(int j = i+1; j < n; j++) {
                if(isConnected[i][j] == 1)
                    uf.union(i, j);
            }
        }

        int provinces = uf.getDistinct();

        return provinces;
    }
}