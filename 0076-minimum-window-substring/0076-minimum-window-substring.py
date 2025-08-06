class Solution(object):
    
    

    def minWindow(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        result=(-1,-1)
        resultLen = float("inf")
        count = 0
        counts=[0]*58
        l=0
        r=0
        for i in range(len(t)):
           counts[ord(t[i])-ord("A")]=counts[ord(t[i])-ord("A")]-1
           
        for r in range(len(s)):
           
            if counts[ord(s[r])-ord("A")] < 0:
                count+=1
            counts[ord(s[r])-ord("A")]=counts[ord(s[r])-ord("A")]+1
            
            while count == len(t):
                if r-l+1 < resultLen :
                    resultLen = r-l+1
                    result = (l,r+1)
                counts[ord(s[l])-ord("A")]-=1
                if counts[ord(s[l])-ord("A")] < 0:
                    count-=1
                l+=1
        return s[result[0]:result[1]]

                




        