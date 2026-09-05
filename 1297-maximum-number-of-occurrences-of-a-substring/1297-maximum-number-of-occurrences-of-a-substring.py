class Solution:
    def maxFreq(self, s: str, maxLetters: int, minSize: int, maxSize: int) -> int:
        result = 0
        freq = {}
        letters = 0
        chrs = [0] * 256

        for i in range(len(s)):
            if chrs[ord(s[i]) - ord("A")] == 0:
                letters += 1

            chrs[ord(s[i]) - ord("A")] += 1
            if i + 1 < minSize:
                continue
            if letters <= maxLetters:
                sub = s[i - minSize + 1:i+1]
                freq[sub] = freq[sub] + 1 if sub in freq else 1
                result = max(result,freq[sub])
            chrs[ord(s[i - minSize + 1]) - ord("A")] -= 1
            if chrs[ord(s[i - minSize + 1]) - ord("A")] == 0:
                letters -= 1
        return result

            

        