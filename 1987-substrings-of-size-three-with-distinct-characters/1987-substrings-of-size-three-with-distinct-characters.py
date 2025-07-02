class Solution(object):
    def countGoodSubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
      
        c=0
        for i in range(len(s)-2):
            hs=set(s[i:i+3])
            if len(hs)==3:
                c+=1
        return c
          
            
          

        return c

        
        