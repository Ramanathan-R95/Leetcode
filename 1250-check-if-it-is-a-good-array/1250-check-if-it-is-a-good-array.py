def gcd(a ,b):
    if b == 0:
        return a
    return gcd(b,a%b)

class Solution:

    def isGoodArray(self, nums: list[int]) -> bool:
        prev = nums[0]
        for i in range(1,len(nums)):
            prev = gcd(prev,nums[i])
        return prev == 1
        