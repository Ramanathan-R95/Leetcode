class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        totalSum = sum(cardPoints)
        n = len(cardPoints)
        minSum = sum(cardPoints[:n-k])
        curSum = minSum
        for i in range(k):
            curSum += cardPoints[n-k+i] - cardPoints[i]
            minSum = min(minSum,curSum)
        return totalSum - minSum




        