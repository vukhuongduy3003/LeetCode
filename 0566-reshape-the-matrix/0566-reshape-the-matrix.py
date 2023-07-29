class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        row, column = len(mat), len(mat[0])
        t = row * column
        if r * c != t:
            return mat
        ans = [[0 for _ in range(c)] for _ in range(r)]
        for i in range(t):
            ans[i // c][i % c] = mat[i // column][i % column]
        return ans