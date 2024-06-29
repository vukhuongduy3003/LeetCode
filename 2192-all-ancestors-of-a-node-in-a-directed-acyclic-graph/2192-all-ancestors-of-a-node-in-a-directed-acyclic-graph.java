class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            graph[u].add(v);
        }
        for (int i = 0; i < n; i++) {
            dfs(graph, ans, new boolean[n], i, i);
        }
        for (int i = 0; i < n; i++) {
            ans.get(i).sort(Integer::compareTo);
        }
        
        return ans;
    }
    private void dfs(List<Integer>[] graph, List<List<Integer>> ans, boolean[] visited, int parent, int curr) {
        visited[curr] = true;
        for (int dest : graph[curr]) {
            if (!visited[dest]) {
                ans.get(dest).add(parent);
                dfs(graph, ans, visited, parent, dest);
            }
        }
    }
}