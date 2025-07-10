class Solution:
    def removeOccurrences(self, s: str, part: str) -> str:
        i=0
        stack=""
        for j in range (len(s)):
            stack+=(s[j])
            if len(stack)>=len(part):
                if part in stack:
                    stack=stack.replace(part,"")
        return stack
