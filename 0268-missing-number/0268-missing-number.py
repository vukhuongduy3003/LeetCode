class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        expectedSum = (n * (n + 1)) // 2
        actualSum = 0
        for v in nums:
            actualSum += v
        return expectedSum - actualSum