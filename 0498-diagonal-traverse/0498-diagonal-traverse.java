class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] ans = new int[m * n];
        boolean var = true;
        int i = 0, j = 0, k = 0;
        while (k < m * n) {
            ans[k] = mat[i][j];
            k++;
            if (var) {
                if (i == 0 && j != n - 1) {
                    j++;
                    var = false;
                } else if (j == n - 1) {
                    i++;
                    var = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (j == 0 && i != m - 1) {
                    i++;
                    var = true;
                } else if (i == m - 1) {
                    j++;
                    var = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}