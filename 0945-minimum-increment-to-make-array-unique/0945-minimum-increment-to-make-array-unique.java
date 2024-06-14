class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int i = 1, ans = 0;
        while (i < nums.length) {
            if (nums[i] <= nums[i - 1]) {
                nums[i] += 1;
                ans++;
            } else {
                i++;
            }
        }
        return ans;
    }
}