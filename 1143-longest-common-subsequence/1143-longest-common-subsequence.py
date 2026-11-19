class Solution:
    def lcs(self,dp,s1,s2,n1,n2):

        if dp[n2][n1] != -1:

            return dp[n2][n1]
        
        if s1[n1 - 1] == s2[n2 - 1]:
            dp[n2][n1] = 1 + self.lcs(dp,s1,s2,n1-1,n2-1)
            return dp[n2][n1]
        else:
            dp[n2][n1] = max(self.lcs(dp,s1,s2,n1,n2-1), self.lcs(dp,s1,s2,n1-1,n2))
            return dp[n2][n1]


    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        dp = [[-1 for i in range(1 + len(text1))] for j in range(len(text2) + 1)]
        for i in range(1 + len(text1)):
            dp[0][i] = 0
        for i in range(1 + len(text2)):
            dp[i][0] = 0
        return self.lcs(dp,text1,text2,len(text1),len(text2))
        



        