class UnionFind {
    private int[] parent;
    private int[] rank;
    public UnionFind(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
        rank = new int[size];
    }
    
    public int find(int x) {
        if (parent[x] != x) {
            return find(parent[x]);
        }
        return parent[x];
    }
    
    public void union(int x, int y) {
        int xset = find(x);
        int yset = find(y);
        if (xset == yset) return;
        if (rank[xset] < rank[yset]) parent[xset] = yset;
        else if (rank[xset] > rank[yset]) parent[yset] = xset;
        else {
            parent[yset] = xset;
            rank[xset]++;
        }
    }
}
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        UnionFind dsu = new UnionFind(n);
        int nFindCircleNum = n;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1 && dsu.find(i) != dsu.find(j)) {
                    nFindCircleNum--;
                    dsu.union(i, j);
                }
            }
        return nFindCircleNum;
    }
}