class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        list1=[]
        nums.sort()
        for i in range (len(nums)):
           for j in range(i+1,len(nums)):
            k=j+1
            l=len(nums)-1
            while k<l:
                L=[]
                sum=nums[i]+nums[j]+nums[k]+nums[l]
                if sum==target:
                    L=[nums[i],nums[j],nums[k],nums[l]]
                    list1.append(L)
                    k+=1
                    l-=1
                elif target>sum:
                    k+=1
                elif target<sum:
                    l-=1
        return set(tuple(e) for e in list1)

        
