class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int l = 0, r = 1;
        int n = prices.length;
        while (r < n) {
            if (prices[l] < prices[r]) {
                ans += prices[r] -prices[l];
            }
            l++;
            r++;
        }
        return ans;
    }
}