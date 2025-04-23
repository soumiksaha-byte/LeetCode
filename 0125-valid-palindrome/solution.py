class Solution:
    def isPalindrome(self, s: str) -> bool:
        new=''.join(i.lower() for i in s if i.isalnum())
        i=0
        j=len(new)-1
        mid=len(new)//2
        while i<j:
            if new[i]==new[j]:
                i+=1
                j-=1
            else:
                return False
        return True
        
