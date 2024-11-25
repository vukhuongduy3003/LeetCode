class UnionFind(object):
    def __init__(self):
        self.parent = [i for i in range(1001)]
        self.rank = [0] * 1001
    
    def find(self, x):
        if self.parent[x] != x:
            self.parent[x] = self.find(self.parent[x])
        return self.parent[x]
    
    def union(self, x, y):
        xset = self.find(x)
        yset = self.find(y)
        if (xset == yset):
            return False
        if (self.rank[xset] < self.rank[yset]):
            self.parent[xset] = yset
        elif (self.rank[xset] > self.rank[yset]):
            self.parent[yset] = xset
        else:
            self.parent[yset] = xset
            self.rank[xset] += 1
        return True

class Solution:
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:
        dsu = UnionFind()
        for edge in edges:
            if not dsu.union(*edge):
                return edge