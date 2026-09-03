class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        n = len(blocks)
        
        l = 0
        temp = 0
        for i in range(k):
            if blocks[i] == "W":
                temp += 1
        result = temp
        for i in range(k,n):
            if blocks[l] == "W":
                temp -= 1
            l += 1
            if blocks[i] == "W":
                temp += 1
            result = min(result,temp)
        return result


        