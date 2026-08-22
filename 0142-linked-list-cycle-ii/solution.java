/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode p=head;
        ListNode q=head;
        while(q!=null && q.next!=null){
            p=p.next;
            q=q.next.next;
             if(p==q){
            ListNode a=head;
            while(a!=p){
                a=a.next;
                p=p.next;
            }
            return a;
            }
        }
        return null;
    }
}
