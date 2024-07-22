class Solution(object):
    def closeStrings(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: bool
        """
        x={}
        y={}
        if len(word1)!=len(word2):
            return False
        for i in word1:
            if i not in word2:
                return False
        for j in word1:
            if j in x:
                x[j] += 1
            else:
                x[j] = 1
        for k in word2:
            if k in y:
                y[k] += 1
            else:
                y[k] = 1
        a=list(x.values())
        b=list(y.values())
        a.sort()
        b.sort()
        if a==b:
            return True
    
        
                
        
