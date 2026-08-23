class Solution(object):
    def maximumWealth(self, accounts):
        result = []
        
        for i in range(len(accounts)):
            sum = 0
            for j in range(len(accounts[i])):
                sum = sum+ accounts[i][j]
                
            result.insert(i , sum)
        return max(result)
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        