class Solution:
   
    def rotate(self, nums: List[int], k: int) -> None:
        i=0
        while (i!=k):
             y=nums[-1]
             nums.pop()
             nums.insert(0,y)
             i+=1

        
