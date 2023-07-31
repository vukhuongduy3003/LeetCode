class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        dic1, dic2 = {}, {}
        for i in magazine:
            if i in dic1:
                dic1[i] += 1
            else:
                dic1[i] = 1
                
        for i in ransomNote:
            if i in dic1:
                dic1[i] -= 1
                if dic1[i] < 0:
                    return False
            else:
                return False
                
        return True