class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, ans = Integer.MAX_VALUE, total = 0;
        for (int r = 0; r < nums.length; r++) {
            total += nums[r];
            while (total >= target) {
                ans = Math.min(r - l + 1, ans);
                total -= nums[l];
                l++;
            }
        }
        return ans == Integer.MAX_VALUE? 0 : ans;
    }
}