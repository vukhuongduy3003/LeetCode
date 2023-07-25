class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num == 1:
            return True
        first, last = 0, num // 2
        while first <= last:
            mid = first + (last - first) // 2
            if mid ** 2 == num:
                return True
            elif mid ** 2 > num:
                last = mid - 1
            else:
                first = mid + 1
        return False