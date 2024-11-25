class UnionFind:
    def __init__(self, n):
        self.parent = [i for i in range(n)]
        self.rank = [1] * n
    
    def find(self, x):
        if (self.parent[x] != x):
            self.parent[x] = self.find(self.parent[x])
        return self.parent[x]
    
    def union(self, x, y):
        xset = self.find(x)
        yset = self.find(y)
        if (xset == yset):
            return
        if (self.rank[xset] < self.rank[yset]):
            self.parent[xset] = yset
        elif (self.rank[xset] > self.rank[yset]):
            self.parent[yset] = xset
        else:
            self.parent[yset] = xset
            self.rank[xset] += 1

class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n = len(isConnected)
        dsu = UnionFind(n)
        findCircleNum = n
        for i in range(n):
            for j in range(i + 1, n):
                if (isConnected[i][j] == 1 and dsu.find(i) != dsu.find(j)):
                    findCircleNum -= 1
                    dsu.union(i, j)
        return findCircleNum