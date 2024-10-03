class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        if x<0:
            y=x*(-1)
            z=str(y)
            a=list(z)
            a.reverse()
            b=''.join(a)
            c=int(b)
            d=c*(-1)
            result=d
        else:
            z=str(x)
            a=list(z)
            a.reverse()
            b=''.join(a)
            c=int(b)
            result=c
        if c>2**31-1:
            return 0
        return result

        
