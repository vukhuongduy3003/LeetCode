class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        lsf, op, pist = inf, 0, 0
        
        for i in range(len(prices)):
            if prices[i] < lsf:
                lsf = prices[i]
            
            pist = prices[i] - lsf
            
            if op < pist:
                op = pist
                
        return op