/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode c1=headA;
        ListNode c2=headB;
        while(c1!=null){
            c2=headB;
            while(c2!=null){
                if(c1==c2){
                    return c1;
                }
                c2=c2.next;
            }
            c1=c1.next;
        }
        return null;
    }
}
