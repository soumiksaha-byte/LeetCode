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
    public boolean isPalindrome(ListNode head) {
        ListNode last=head;
        int size=0;
        List<Integer>list=new ArrayList<>();
        while(last!=null){
            list.add(last.val);
            last=last.next;
        }
        int i=0;
        int j=list.size()-1;
        while(i<j){
            if(list.get(i)==list.get(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
