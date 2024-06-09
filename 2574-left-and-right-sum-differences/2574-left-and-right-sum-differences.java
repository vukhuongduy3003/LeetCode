class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] prefLeft = new int[n + 1], prefRight = new int[n + 1];
        int temp = Arrays.stream(nums).sum();
        for (int i = 0; i < n; i++) {
            prefLeft[i + 1] = prefLeft[i] + nums[i];
            prefRight[i] = temp;
            temp -= nums[i];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(prefLeft[i] - prefRight[i + 1]);
        }
        return ans;
    }
}