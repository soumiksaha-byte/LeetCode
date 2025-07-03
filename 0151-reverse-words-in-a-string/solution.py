class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        x=s.split()
        x.reverse()
        result=' '.join(x)
        return result
        
