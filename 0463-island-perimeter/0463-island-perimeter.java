class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int cnt = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    if (grid[x][y] == 0) {
                        continue;
                    }
                    if ((nx < 0 || nx >= n) || (ny < 0 || ny >= m) || grid[nx][ny] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}