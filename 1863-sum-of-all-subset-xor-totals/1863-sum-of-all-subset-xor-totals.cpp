class Solution {
private:
    int ans = 0;
    
public:
    void dfs(vector<int>& nums, int i, int s) {
        if (i == nums.size()) {
            ans += s;
            return;
        }
        dfs(nums, i + 1, s ^ nums[i]);
        dfs(nums, i + 1, s);
    }
    
    int subsetXORSum(vector<int>& nums) {
        dfs(nums, 0, 0);
        return ans;
    }
};