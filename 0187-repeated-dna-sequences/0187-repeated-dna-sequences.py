class Solution(object):
    def findRepeatedDnaSequences(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        n=len(s)
        result = []
        l=0
        sequence = s[:10]

        d={}
        d[sequence]=1
        
        for r in range(10,n):
            sequence=sequence[1:]+s[r]
            if sequence in d and d[sequence] != -1:
                
                d[sequence]+=1
                if d[sequence] > 1:
                    result.append(sequence)
                    d[sequence] = -1
            elif sequence not in d:
                d[sequence]=1
        return result
            


        














        