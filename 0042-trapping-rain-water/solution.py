class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left=[]
        right=[]
        result=[]
        m1=height[0]
        m2=height[len(height)-1]
        for i in height:
            if i>=m1:
                m1=i
                left.append(i)
            else:
                left.append(m1)
        
        for i in reversed(height):
            m2 = max(m2, i)
            right.append(m2)

        right.reverse()
        j=0
        while j<len(height):
            x=(min(left[j],right[j])-height[j])
            result.append(x)
            j+=1
        return sum(result)


        

