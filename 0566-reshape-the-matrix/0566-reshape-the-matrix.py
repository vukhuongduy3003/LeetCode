class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        row, column = len(mat), len(mat[0])
        
        if row * column != r * c:
            return mat
        
        temp = []
        for i in range(row):
            for j in range(column):
                temp.append(mat[i][j])
        
        k = 0
        ans = [[0 for _ in range(c)] for _ in range(r)]
        for i in range(r):
            for j in range(c):
                ans[i][j] = temp[k]
                k += 1
                
        return ans
        