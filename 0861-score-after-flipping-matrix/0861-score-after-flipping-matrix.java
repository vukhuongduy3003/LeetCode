class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }
        
        for (int j = 0; j < n; j++) {
            int cntOne = 0;
            for (int i = 0; i < m; i++) {
                cntOne += grid[i][j];
            }
            if (cntOne < m - cntOne) {
                for (int i = 0; i < m; i++) {
                    grid[i][j] ^= 1;
                }
            }
        }
        
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int iNum = 1, dec = 0;
            for (int j = n - 1; j >= 0; j--) {
                dec += grid[i][j] * iNum;
                iNum *= 2;
            }
            ans += dec;
        }
        return ans;
    }
}