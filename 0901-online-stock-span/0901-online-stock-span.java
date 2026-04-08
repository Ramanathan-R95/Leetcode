class StockSpanner {
    Stack<int[]> stocks;
    public StockSpanner() {
        this.stocks = new Stack<>();
    }
    public int next(int price) {
        int span = 1 ;
        while (!stocks.isEmpty() && stocks.peek()[1] <= price){
            span += stocks.pop()[0];
        }
        stocks.push(new int[]{span,price});
        return span;




        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */