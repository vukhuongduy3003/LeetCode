class Solution:
    def updateMatrix(self, mat: List[List[int]]) -> List[List[int]]:
        d = [[-1, 0], [1, 0], [0, -1], [0, 1]]
        dq = deque()
        m, n = len(mat), len(mat[0])
        ans = [[0] * n for _ in range(m)]
        
        for i in range(m):
            for j in range(n):
                if mat[i][j] == 0:
                    dq.append((i, j))
        
        count = 0
        while dq:
            count += 1
            for _ in range(len(dq)):
                start_point = dq.popleft()
                for (x, y) in d:
                    dx = start_point[0] + x
                    dy = start_point[1] + y
                    if dx >= 0 and dy >= 0 and dx < m and dy < n and not mat[dx][dy] == 0:
                        dq.append((dx, dy))
                        ans[dx][dy] = count
                        mat[dx][dy] = 0
        return ans