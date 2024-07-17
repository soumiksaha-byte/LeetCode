class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        count_dict = {}
        for num in arr:
            if num in count_dict:
              count_dict[num] += 1
            else:
              count_dict[num] = 1
    
    # Get the list of occurrence counts
        occurrences = list(count_dict.values())
    
    # Check if the number of unique occurrence counts is equal to the length of the occurrences list
        return len(occurrences) == len(set(occurrences))
