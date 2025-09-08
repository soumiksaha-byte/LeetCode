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
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        // Store values
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        // Build reversed list
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        for (int i = list.size() - 1; i >= 0; i--) {
            res.next = new ListNode(list.get(i));
            res = res.next;
        }

        return dummy.next;
    }
}

