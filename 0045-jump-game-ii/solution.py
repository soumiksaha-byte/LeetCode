class Solution:
    def jump(self, nums: List[int]) -> int:
        p=0
        r=0
        q=(len(nums)-1)
        jump=0
        while p<q :
            x=0
            for i in range (0,p+1):
                x=max(x,i+nums[i])
            r=p+1
            p=x
            jump+=1
        return jump
            

            
        
