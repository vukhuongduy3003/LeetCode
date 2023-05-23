class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int count = 0;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[j] == target - nums[i]) {
                    ans[count++] = i;
                    ans[count++] = j;
                }
            }
        }
        return ans;
    }
}