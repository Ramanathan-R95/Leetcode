class BrowserHistory:
    class Page :
        def __init__(self,url):
            self.url = url
            self.next = None
            self.prev = None 

    def __init__(self, homepage: str):
        self.home = BrowserHistory.Page(homepage)
        self.cur = self.home 


        

    def visit(self, url: str) -> None:
        nextPage = BrowserHistory.Page(url)
        if self.cur :
            self.cur.next = nextPage 
            nextPage.prev = self.cur
            self.cur = self.cur.next
        else :
            self.cur = nextPage
        return self.cur.url
        

    def back(self, steps: int) -> str:
        while self.cur.prev and steps > 0 :
            self.cur = self.cur.prev 
            steps -= 1
        return self.cur.url
        

    def forward(self, steps: int) -> str:
        while self.cur.next and steps > 0:
            self.cur = self.cur.next 
            steps -= 1
        return self.cur.url

        


# Your BrowserHistory object will be instantiated and called as such:
# obj = BrowserHistory(homepage)
# obj.visit(url)
# param_2 = obj.back(steps)
# param_3 = obj.forward(steps)