class Solution {
    public int[][] merge(int[][] intervals) {
        List<Integer[]> list = new ArrayList<>();
        for (int[] inter : intervals) {
            list.add(new Integer[]{inter[0], inter[1]});
        }
        Collections.sort(list, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] a, Integer[] b) {
                return a[0].compareTo(b[0]);
            }
        });
        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i)[1] >= list.get(i + 1)[0]) {
                list.get(i)[1] = Math.max(list.get(i)[1], list.get(i + 1)[1]);
                list.remove(i + 1);
                i--;
            }
        }
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }
        return ans;
    }
}