class Solution(object):
    def invalidTransactions(self, transactions):
        """
        :type transactions: List[str]
        :rtype: List[str]
        """
        res = []
        trans = [i.split(",") for i in transactions]
        for i in range(len(trans)):

            for j in range(len(trans)):
                if i != j:
                    invalid = int(trans[i][2]) > 1000
                    if trans[i][0] == trans[j][0] and trans[i][-1] != trans[j][-1] and abs(int(trans[i][1]) - int(trans[j][1])) <= 60:
                        invalid = True
                        break
            if invalid:
                res.append(",".join(trans[i]))

        return res
        