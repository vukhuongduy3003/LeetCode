class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = [[1 for _ in range(y)] for y in range(numRows)]
        for i in range(1, numRows + 1):
            row = [1 for _ in range(i)]
            for j in range(1, i - 1):
                row[j] = ans[i - 2][j - 1] + ans[i - 2][j]
            ans[i - 1] = row
        return ans