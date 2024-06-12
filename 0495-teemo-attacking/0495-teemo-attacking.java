class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[]{timeSeries[i], timeSeries[i] + duration - 1};
        }
        List<Integer[]> list = new ArrayList<Integer[]>();
        list.add(new Integer[]{arr[0][0], arr[0][1]});
        for (int i = 1; i < n; i++) {
            if (list.get(list.size() - 1)[1] >= arr[i][0]) {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], arr[i][1]);
            } else {
                list.add(new Integer[]{arr[i][0], arr[i][1]});
            }
        }
        int ans = 0;
        for (Integer[] e : list) {
            ans += e[1] - e[0] + 1;
        }
        return ans;
    }
}