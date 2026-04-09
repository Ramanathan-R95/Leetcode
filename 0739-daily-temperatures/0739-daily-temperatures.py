class Solution(object):
    def dailyTemperatures(self, temperatures):
        """
        :type temperatures: List[int]
        :rtype: List[int]
        """
        stack = []
        n = len(temperatures)
        result = [0] * n
        for i in range(n-1, -1, -1):
            while stack and temperatures[i] >= stack[-1][1]:
                stack.pop()
            if stack:
                result[i] = stack[-1][0] - i 
            stack.append([i,temperatures[i]])

        return result

         