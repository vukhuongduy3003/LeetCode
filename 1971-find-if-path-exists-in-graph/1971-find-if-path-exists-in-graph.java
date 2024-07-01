class Solution {
    class UnionFind {
        private int[] Parent;
        private int[] Size;
        public UnionFind(int n) {
            Parent = new int[n];
            for (int i = 0; i < n; i++) {
                Parent[i] = i;
            }
            Size = new int[n];
            Arrays.fill(Size, 1);
        }
        public int find(int i) {
            if (Parent[i] != i) {
                Parent[i] = find(Parent[i]);
            }
            return Parent[i];
        }
        public void unionBySize(int i, int j) {
            int irep = find(i);
            int jrep = find(j);
            if (irep == jrep) {
                return;
            }
            int isize = Size[irep];
            int jsize = Size[jrep];
            if (isize < jsize) {
                Parent[irep] = jrep;
                Size[jrep] += Size[irep];
            } else {
                Parent[jrep] = irep;
                Size[irep] += Size[jrep];
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFind uf = new UnionFind(n);
        for (int[] e : edges) {
            uf.unionBySize(e[0], e[1]);
        }
        if (uf.find(source) == uf.find(destination)) {
            return true;
        }
        return false;
    }
}