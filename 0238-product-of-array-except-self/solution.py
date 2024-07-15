class Solution(object):
    def productExceptSelf(self, nums):
        l=len(nums)
        prefix = []
        postfix = []
        output=[]
        temp = 1
        temp1 = 1
        for i in range(l):
            temp = temp * nums[i]
            prefix.append(temp)
        for j in range(l - 1, -1, -1):
            temp1 = temp1 * nums[j]
            postfix.append(temp1)
        postfix=postfix[::-1]
        for i in range(l):
            if(i==0):
                t=postfix[i+1]
                output.append(t)
            elif(i==l-1):
                t=prefix[i-1]
                output.append(t)
            else:
                t=prefix[i-1]*postfix[i+1]
                output.append(t)
        return output




obj = Solution()
nums = [1, 2, 3, 4]
print(obj.productExceptSelf(nums))
