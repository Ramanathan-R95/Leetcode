class StockSpanner:

    def __init__(self):
        self.stocks = []
        

    def next(self, price: int) -> int:
        span = 1
        while self.stocks and self.stocks[-1][1] <= price :
            span += self.stocks.pop()[0]
        self.stocks.append([span,price])
        return span

        


# Your StockSpanner object will be instantiated and called as such:
# obj = StockSpanner()
# param_1 = obj.next(price)