class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hset = set()
        for v in nums:
            if v in hset:
                return True
            else:
                hset.add(v)
        return False