from sortedcontainers import SortedList

class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        st = SortedList()
        ans = []
        l = 0
        for r in range(len(nums)):
            st.add(nums[r])
            
            if r - l + 1 == k:
                ans.append(st[-1])
                st.remove(nums[l])
                l += 1
        return ans