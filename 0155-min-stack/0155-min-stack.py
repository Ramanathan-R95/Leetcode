class MinStack:

    def __init__(self):
        
        self.stack=[]
        

    def push(self, val: int) -> None:
        
        self.stack.append(val)
        

    def pop(self) -> None:
        self.stack.pop()
        

    def top(self) -> int:
        return self.stack[-1]
        

    def getMin(self) -> int:
        min_val = float("inf")
        for i in self.stack :
            if i < min_val :
                min_val = i
        return min_val
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()