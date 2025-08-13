class Solution(object):
    def findRepeatedDnaSequences(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        n=len(s)
        result = set()
        l=0
        sequence = s[:10]

        d=set()
        d.add(sequence)
        
        for r in range(10,n):
            sequence=sequence[1:]+s[r]
            if sequence in d:
                result.add(sequence)
            else:
                d.add(sequence)
                
                
               
            
        return list(result)
            


        














        