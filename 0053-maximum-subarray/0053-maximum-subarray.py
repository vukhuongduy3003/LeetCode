class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cur_max, ans = 0, -inf
        for v in nums:
            cur_max = max(v, cur_max + v)
            ans = max(ans, cur_max)
        return ans