class Solution:
    def findChampion(self, n: int, edges: List[List[int]]) -> int:
        indegree = [0] * n
        for edge in edges:
            indegree[edge[1]] += 1
        
        championCount = 0
        champion = -1
        for i in range(0, n):
            if indegree[i] == 0:
                championCount += 1
                champion = i
        
        return champion if championCount == 1 else -1