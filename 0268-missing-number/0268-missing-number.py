class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        first, last = 0, n - 1
        while first <= last:
            mid = first + (last - first) // 2
            if mid == nums[mid]:
                first = mid + 1
            else:
                last = mid - 1
        return first