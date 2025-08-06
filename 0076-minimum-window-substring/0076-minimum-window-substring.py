class Solution(object):
    def check(self,counts):
        for i in counts:
            if i < 0:
                return False
        return True
    

    def minWindow(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        result=""
        resultLen = float("inf")
        
        counts=[0]*62
        l=0
        r=0
        for i in range(len(t)):
            counts[ord(t[i])-ord("A")]=counts[ord(t[i])-ord("A")]-1
        for r in range(len(s)):
           
            counts[ord(s[r])-ord("A")]=counts[ord(s[r])-ord("A")]+1
            while self.check(counts):
                if r-l+1 < resultLen :
                    resultLen = r-l+1
                    result = s[l:r+1]
                counts[ord(s[l])-ord("A")]-=1
                l+=1
        return result

                




        