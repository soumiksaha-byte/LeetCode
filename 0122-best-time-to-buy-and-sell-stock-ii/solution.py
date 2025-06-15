class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices)==0:
            return 0
        i=1
        j=(len(prices)-1)
        profit=0
        while i<=j:
            if prices[i]>prices[i-1]:
                profit=profit+(prices[i]-prices[i-1])
            i+=1
        return profit

        
            
            
        
