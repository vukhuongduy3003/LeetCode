class Solution {
    public int jump(int[] nums) {
        int n = nums.length - 1, l = 0, r = 0, res = 0;
        while (r < n) {
            int f = 0;
            for (int i = l; i < r + 1; i++) {
                f = Math.max(f, i + nums[i]);
            }
            l = r + 1;
            r = f;
            res++;
        }
        return res;
    }
}