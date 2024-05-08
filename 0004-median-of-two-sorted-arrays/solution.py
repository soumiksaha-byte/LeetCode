class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:

        list1=nums1+nums2
        list1.sort()
        if len(list1)%2!=0:
            mid=len(list1)//2
            return list1[mid]
        else:
            mid=len(list1)//2
            z=(list1[mid]+list1[mid-1])/2
            return z

