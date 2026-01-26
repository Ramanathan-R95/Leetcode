class BrowserHistory {
    Page cur ;
    class Page{
        String url ;
        Page next , prev ;
        public  Page(String url){
            this.url = url ;
            this.prev = null ;
            this.next = null ;

        }

    }
    
    

    public BrowserHistory(String homepage) {
        cur = new Page(homepage) ;

        
    }
    
    public void visit(String url) {
        Page nextPage = new Page(url) ;
        nextPage.prev = cur ;
        cur.next = nextPage ;
        cur = cur.next ;

        
    }
    
    public String back(int steps) {
        while(cur.prev != null && steps > 0) {
            steps--;
            cur = cur.prev ;
        }
        return cur.url ;
        
    }
    
    public String forward(int steps) {
        while(cur.next != null && steps > 0) {
            steps--;
            cur = cur.next ;
        }
        return cur.url ;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
