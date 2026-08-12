class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        last = [-1,-1,-1]
        l = 0 
        n = len(s)
        result = 0
        for r in range(n):
            ind =  ord(s[r]) - ord("a")
            last[ind] = r
            m = min(last)
            result += m + 1
        return result

        