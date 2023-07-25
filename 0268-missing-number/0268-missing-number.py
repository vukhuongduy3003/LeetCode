class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        ans = 0
        n = len(nums)
        for i in range(0, n):
            ans ^= nums[i] ^ i
        ans ^= n
        return ans