class StockSpanner {
    ArrayList<Integer> stock; 
    public StockSpanner() {
        stock = new ArrayList<>();
        
    }
    
    public int next(int price) {
        int result = 1 ;
        int n = stock.size();
        for(int i=n-1;i>=0;i--){
            if(stock.get(i) <= price ){
                result++;
            }
            else
                break;
        }
        stock.add(price);
        return result;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */