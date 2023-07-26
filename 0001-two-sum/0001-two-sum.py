class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashTable = {}
        n = len(nums)
        
        for i in range(n):
            hashTable[nums[i]] = i
        
        for i in range(n):
            complement = target - nums[i]
            if complement in hashTable and hashTable[complement] != i:
                return [i, hashTable[complement]]
        
        return []