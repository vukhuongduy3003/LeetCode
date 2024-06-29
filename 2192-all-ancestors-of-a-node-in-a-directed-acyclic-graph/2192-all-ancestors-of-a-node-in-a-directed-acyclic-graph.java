class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();
        
        // Initialize adjacency list and visited list
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }
        
        // Populate the adjacency list
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            arr.get(v).add(u);
        }
        
        // Find ancestors for each node
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            List<Boolean> visited = new ArrayList<>(Collections.nCopies(n, false));
            dfs(i, arr, temp, visited);
            Collections.sort(temp);
            ans.add(temp);
        }
        return ans;
    }
    
    private void dfs(int u, List<List<Integer>> arr, List<Integer> temp, List<Boolean> visited) {
        visited.set(u, true);
        for (int v : arr.get(u)) {
            if (!visited.get(v)) {
                temp.add(v);
                dfs(v, arr, temp, visited);
            }
        }
    }
}