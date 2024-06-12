class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        int[][] ans = new int[n][2];
        ans[0] = intervals[0];
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (ans[j][1] >= intervals[i][0]) {
                ans[j][1] = Math.max(ans[j][1], intervals[i][1]);
            } else {
                j++;
                ans[j] = intervals[i];
            }
        }
        return Arrays.copyOf(ans, j + 1);
    }
}