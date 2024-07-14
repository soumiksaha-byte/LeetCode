class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        v=[]
        st=list(s)
        for i in s:
            if i in vowels:
                 v.append(i)
        j=0
        v.reverse()
        for i in range(len(s)):
             if st[i] in vowels:
                 st[i]=v[j]
                 j+=1
        t=''.join(st)
        return t
        
        

