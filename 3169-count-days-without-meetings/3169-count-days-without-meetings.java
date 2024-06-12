class Solution {
    public int countDays(int days, int[][] meetings) {
        int n = meetings.length;
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        List<Integer[]> list = new ArrayList<Integer[]>();
        list.add(new Integer[]{meetings[0][0], meetings[0][1]});
        for (int i = 1; i < n; i++) {
            Integer[] temp;
            if (list.get(list.size() - 1)[1] >= meetings[i][0]) {
                int ma = Math.max(list.get(list.size() - 1)[1], meetings[i][1]);
                temp = new Integer[]{list.get(list.size() - 1)[0], ma};
                list.set(list.size() - 1, temp);
            } else {
                temp = new Integer[]{meetings[i][0], meetings[i][1]};
                list.add(temp);
            }
            
        }
        int count = 0;
        for (Integer[] e : list) {
            System.out.println(e[0] + ", " + e[1]);
            count += (e[1] - e[0]) + 1;
        }
        return days - count;
    }
}