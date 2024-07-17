# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteMiddle(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        p=head
        q=head
        r=None
        x=[]
        s=head
        if head==None or head.next==None:
             return None
        while p and p.next:
             r=q
             q=q.next
             p=p.next.next
        r.next=q.next
        return s
