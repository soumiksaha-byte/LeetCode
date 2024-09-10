# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
def gcd(a,b):
    while b!=0:
        a,b=b,a%b
    return a
class Solution(object):
    def insertGreatestCommonDivisors(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        dummy=head.next
        if head is None or dummy is None:
            return head
        i=head
        j=i.next
        while j is not None:
            x=gcd(i.val,j.val)
            y=ListNode(x)
            i.next=y
            y.next=j
            i=j
            j=j.next
        return head
        
 
