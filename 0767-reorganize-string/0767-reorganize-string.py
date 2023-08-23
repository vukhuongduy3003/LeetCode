class Solution:
    def reorganizeString(self, s: str) -> str:
        cnt = {}
        
        for c in s:
            if c not in cnt:
                cnt[c] = 1
            else:
                cnt[c] += 1
        
        pq = []
        
        for c in cnt:
            heappush(pq, (-cnt[c], c))
            
        ans = ""
        while len(pq) >= 2:
            c1, v1 = heappop(pq)
            c2, v2 = heappop(pq)
            ans += v1 + v2
            c1 = c1 * (-1) - 1
            c2 = c2 * (-1) - 1
            if c1 > 0:
                heappush(pq, (-c1, v1))
            if c2 > 0:
                heappush(pq, (-c2, v2))
                
        if len(pq) == 1:
            c1, v1 = heappop(pq)
            if -c1 == 1:
                return ans + v1
            else:
                return ""
            
        return ans
        