class Solution(object):
    def rowAndMaximumOnes(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        res = [float("-inf"),float("-inf")]
        for i in range(len(mat)):
            c=0
            for j in range(len(mat[i])):
                if mat[i][j] == 1 :
                    c+=1
            if c > res[1]:
                res[1] = c
                res[0] = i
        return res


        