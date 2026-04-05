class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        stack = []
        result = ""
        for i in num :
            while k and stack and ord(stack[-1]) - ord("0") > ord(i) - ord("0") :
                k-=1
                stack.pop()
            if not stack and i == "0":
                continue
            stack.append(i)
        while stack and k :
            stack.pop()
            k-=1
        for i in stack :
            result+=i
        if not result:
            return "0"
        return result
        
        