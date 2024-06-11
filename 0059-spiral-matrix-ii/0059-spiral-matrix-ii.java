class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int val = 1;
        int l = 0, r = n - 1, t = 0, b = n - 1;
        while (val <= n * n) {
            for (int j = l; j <= r; j++) {
                ans[l][j] = val;
                val++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                ans[i][r] = val;
                val++;
            }
            r--;
            for (int j = r; j >= l; j--) {
                ans[b][j] = val;
                val++;
            }
            b--;
            for (int i = b; i > l; i--) {
                ans[i][l] = val;
                val++;
            }
            l++;
        }
        return ans;
    }
}