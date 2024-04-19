class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int n, m;
    public void DFS(char[][] grid, int x, int y) {
        grid[x][y] = '0';
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (((0 <= nx && nx < n) && (0 <= ny && ny < m)) && grid[nx][ny] == '1') {
                DFS(grid, nx, ny);
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        int cnt = 0;
        n = grid.length;
        m = grid[0].length;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (grid[x][y] == '1') {
                    cnt++;
                    DFS(grid, x, y);
                }
            }
        }
        return cnt;
    }
}