class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int nextVal2 = 2, nextVal3 = 3, nextVal5 = 5;
        for (int i = 1; i < n; i++) {
            int nextUglyNum = Math.min(nextVal2, Math.min(nextVal3, nextVal5));
            dp[i] = nextUglyNum;
            if (nextUglyNum == nextVal2) {
                index2++;
                nextVal2 = dp[index2] * 2;
            }
            if (nextUglyNum == nextVal3) {
                index3++;
                nextVal3 = dp[index3] * 3;
            }
            if (nextUglyNum == nextVal5) {
                index5++;
                nextVal5 = dp[index5] * 5;
            }
        }
        return dp[n - 1];
    }
}