class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length, n = points[0].length;
        long[] prev = new long[n];
        for (int i = 0; i < n; i++) {
            prev[i] = points[0][i];
        }
        for (int i = 1; i < m; i++) {
            long[] left_max = new long[n];
            long[] right_max = new long[n];

            left_max[0] = prev[0];
            for (int j = 1; j < n; j++) {
                left_max[j] = Math.max(left_max[j - 1] - 1, prev[j]);
            }

            right_max[n - 1] = prev[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                right_max[j] = Math.max(right_max[j + 1] - 1, prev[j]);
            }

            for (int j = 0; j < n; j++) {
                prev[j] = points[i][j] + Math.max(left_max[j], right_max[j]);
            }
        }
        long ans = 0;
        for (long val : prev) {
            ans = Math.max(val, ans);
        }
        return ans;
    }
}