class Solution:
    def firstUniqChar(self, s: str) -> int:
        diction = Counter(s)
        for i in range(len(s)):
            if diction[s[i]] == 1:
                return i
        return -1