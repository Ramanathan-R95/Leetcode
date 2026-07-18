class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        l , r = 0 , 0
        hashmap = {}
        result = 0
        for r in range(len(fruits)):
            if fruits[r] in hashmap:
                hashmap[fruits[r]] += 1
            else:
                hashmap[fruits[r]] = 1
            while len(hashmap) > 2:
                hashmap[fruits[l]] -= 1
                if hashmap[fruits[l]] == 0:
                    hashmap.pop(fruits[l])
                l += 1
            result = max(result, r - l + 1)
        return result
            

        