class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] edge_cnt = new int[n];
        for (int[] r : roads) {
            edge_cnt[r[0]]++;
            edge_cnt[r[1]]++;
        }
        Arrays.sort(edge_cnt);
        long res = 0, label = 1;
        for (int e : edge_cnt) {
            res += label * e;
            label++;
        }
        return res;
    }
}