class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit, buy = 0, inf
        for p in prices:
            profit = max(profit, p - buy)
            buy = min(buy, p)
        return profit