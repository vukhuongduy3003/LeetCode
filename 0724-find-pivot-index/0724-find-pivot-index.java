class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        if (prefixSum[n] - prefixSum[1] == 0) {
            return 0;
        }
        int ans = 1;
        while (ans < n) {
            if (prefixSum[ans] == prefixSum[n] - prefixSum[ans + 1]) {
                return ans;
            }
            ans++;
        }
        return -1;
    }
}