class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
      dummyHead = ListNode(0)
      tail = dummyHead
      carry = 0
      while l1 is not None or l2 is not None or carry!=0:
        p=l1.val if l1 is not None else 0
        q=l2.val if l2 is not None else 0
        x=(p+q+carry)
        y=x%10
        carry=x//10
        new=ListNode(y)
        tail.next=new
        tail=tail.next
        l1=l1.next if l1 is not None else None
        l2=l2.next if l2 is not None else None
      return dummyHead.next


