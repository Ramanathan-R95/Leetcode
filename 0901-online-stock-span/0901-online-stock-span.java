class StockSpanner {
    Stack<Integer> stocks ;
    ArrayList<Integer> list ;
    
    public StockSpanner() {
        stocks = new Stack<>();
        list = new ArrayList<>();



        
    }
    
    public int next(int price) {
        list.add(price);
        int pge ;
        while(!stocks.isEmpty() && list.get(stocks.peek()) <= price){
            stocks.pop();
        }
        pge = stocks.isEmpty() ? list.size() : list.size() - stocks.peek() - 1;
        stocks.push(list.size()-1);
        return pge;



     
    }
}

/** Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
