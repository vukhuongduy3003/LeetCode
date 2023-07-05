class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        flag = False
        kcount = 0
        for i in range(len(s) - 1, -1, -1):
            if s[i] == " " and flag:
                break
            if s[i] != " ":
                kcount += 1
                flag = True
        return kcount