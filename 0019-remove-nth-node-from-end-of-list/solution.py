# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy=ListNode(0)
        dummy.next=head
        i=0
        j=dummy

        while j.next is not None:
            j=j.next
            i=i+1
        x=i-n
        y=0
        z=dummy
        while y!=x:
            z=z.next
            y=y+1
        z.next=z.next.next
        return dummy.next

