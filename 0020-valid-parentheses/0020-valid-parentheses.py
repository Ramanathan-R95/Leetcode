class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in s :
            if i in "{[(" :
                stack.append(i)

            else :
                if stack == [] : return False 
                temp = stack.pop()
                if i == ")" and temp != "(" : return False
                elif i == "}" and temp != "{" : return False
                elif i == "]" and temp != "[" : return False
        return True if stack ==[] else False
                
