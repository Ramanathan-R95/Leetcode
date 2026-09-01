class Solution:
    def check(self,freq):
        for i in freq:
            if i < 0:
                return False
        return True
    def minWindow(self, s: str, t: str) -> str:
        freq = [0] * 256
        for i in t:
            freq[ord(i) - ord("A")] -= 1
        l = 0
        r = 0
        temp = [-1, -1]

        if len(t) > len(s):
            return ""
        flag = float("inf")
        for r in range(len(s)):
            freq[ord(s[r]) - ord("A")] += 1
            while self.check(freq):
                if r - l + 1 < flag:
                    flag = r - l + 1
                    temp[0] = l
                    temp[1] = r
                freq[ord(s[l]) - ord("A")] -= 1
                l += 1
        return s[temp[0] : temp[1] + 1]



