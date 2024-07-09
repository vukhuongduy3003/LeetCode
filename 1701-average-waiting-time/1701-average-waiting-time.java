class Solution {
    public double averageWaitingTime(int[][] customers) {
        double sumTime = 0.0;
        int time = -1;
        for (int[] c : customers) {
            time = (time < c[0])? c[0] : time;
            time += c[1];
            sumTime += time - c[0];
        }
        return sumTime / customers.length;
    }
}