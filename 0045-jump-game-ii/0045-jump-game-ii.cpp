int memo[100001];

class Solution {
public:
    int dp(vector<int> &nums, int i) {
        if (i >= nums.size() - 1) {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        int ans = 1e9;
        for (int j = 1; j <= nums[i]; ++j) {
            ans = min(ans, 1 + dp(nums, i + j));
        }
        return memo[i] = ans;
    }
    int jump(vector<int>& nums) {
        memset(memo, -1, sizeof(memo));
        return dp(nums, 0);
    }
};