class Solution(object):
    def getFinalState(self, nums, k, multiplier):
        """
        :type nums: List[int]
        :type k: int
        :type multiplier: int
        :rtype: List[int]
        """
    
        for _ in range(k):
            i=0
            mini=min(nums)
            while nums[i]!=mini:
                i+=1
            nums[i]=nums[i]*multiplier

        return nums
        
