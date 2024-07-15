class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        pointer_s, pointer_t = 0, 0
        len_s, len_t = len(s), len(t)
    
    # Iterate through t while there are characters left in both s and t
        while pointer_s < len_s and pointer_t < len_t:
        # If characters match, move the pointer for s
            if s[pointer_s] == t[pointer_t]:
                pointer_s += 1
        # Always move the pointer for t
            pointer_t += 1
    
    # If pointer_s has reached the end of s, it means all characters of s were found in t in order
        return pointer_s == len_s
