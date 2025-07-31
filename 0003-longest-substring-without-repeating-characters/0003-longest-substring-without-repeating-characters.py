class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        left = 0
        result = 0
        visited=[False]*256
        for right in range(len(s)):
            while visited[ord(s[right])]:
                visited[ord(s[left])]=False
                left+=1
            visited[ord(s[right])]=True
            result=max(result,right-left+1)
        return result

        