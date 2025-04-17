class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        l=[0]*26
        for i in s:
            l[ord(i)-ord("a")]+=1
        for i in t:
            if  l[ord(i)-ord("a")]-1<0:
                return False
            l[ord(i)-ord("a")]-=1
        return True
        

        