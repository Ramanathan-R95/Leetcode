class Solution:
    def strongPasswordCheckerII(self, password: str) -> bool:
        low = False
        upper = False
        digit = False
        special = False
        
        sp = set("!@#$%^&*()-+")
        if len(password) < 8: return False
        for i in password:
            if i in sp:
                special = True
            if i.isdigit():
                digit = True
            if i.isupper():
                upper = True
            if i.islower():
                low = True
        for i in range(1, len(password)):
            if password[i] == password[i-1]:
                return False
        return low and upper and digit and special 

        