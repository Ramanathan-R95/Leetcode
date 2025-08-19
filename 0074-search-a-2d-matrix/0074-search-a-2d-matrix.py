class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        l1 = 0 
        r1 = len(matrix) - 1
        while l1 <= r1:
            m1 = ( l1 + r1 ) // 2
            if matrix[m1][0] > target :
                r1 = m1 - 1
            elif target > matrix[m1][-1]:
                l1 = m1 + 1
            else :
                l = 0
                r = len(matrix[0]) - 1
                while l <= r :
                    m = (l + r )// 2
                    if target == matrix[m1][m]:
                        return True
                    elif target > matrix[m1][m]:
                        l = m + 1
                    else :
                        r = m - 1
                return False
        return False

        