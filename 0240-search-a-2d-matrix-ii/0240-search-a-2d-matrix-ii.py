class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        for i in range(len(matrix)):
            l = 0
            r = len(matrix[i]) - 1
            while l <= r :
                m = (l + r) // 2
                if matrix[i][m] == target :
                    return True
                elif matrix[i][m] > target :
                    r = m - 1
                else :
                    l = m + 1
        return False

        