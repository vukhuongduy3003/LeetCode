class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        s, maxSum = 0, -inf
        
        for i in range(k):
            s += nums[i]
        
        maxSum = max(s, maxSum)
        
        for i in range(k, len(nums)):
            s += nums[i] - nums[i - k]
            maxSum = max(s, maxSum)
            
        return maxSum / k