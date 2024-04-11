
class Solution(object):
    def maxVowels(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        max_vowels = 0
        current_vowels = 0
        
        # Count vowels in the first window of size k
        for i in range(k):
            if s[i] in vowels:
                current_vowels += 1
        
        max_vowels = current_vowels
        
        # Slide the window and update the count of vowels
        for i in range(k, len(s)):
            if s[i-k] in vowels:
                current_vowels -= 1
            if s[i] in vowels:
                current_vowels += 1
            max_vowels = max(max_vowels, current_vowels)
        
        return max_vowels

# Example usage:
solution = Solution()
s = "leetcode"
k = 3
print(solution.maxVowels(s, k))  # Output should be 2

