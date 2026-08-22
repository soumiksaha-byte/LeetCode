/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small= new ListNode(0);
        ListNode large= new ListNode(0);
        ListNode s1=small;
        ListNode l1=large;
        while(head!=null){
            if(head.val<x){
                s1.next=head;
                s1=s1.next;
            }else{
                l1.next=head;
                l1=l1.next;
            }
            head=head.next;
        }
        l1.next = null;
        s1.next=large.next;
        return small.next;
    }
}
