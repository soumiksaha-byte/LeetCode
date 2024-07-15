class Solution:
    def reverseWords(self, s: str) -> str:
        x = s.split()
    # Reverse the list of words
        x.reverse()
    # Join the reversed list of words into a single string with a single space separating each word
        y = ' '.join(x)
        return y
        
