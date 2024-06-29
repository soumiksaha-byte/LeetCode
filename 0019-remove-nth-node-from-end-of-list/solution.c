/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode dummy;
    dummy.next=head;
    struct ListNode* p=&dummy;
    struct ListNode* q=&dummy;
    for(int i=0;i<=n;i++){
      if (p==NULL){return dummy.next;}
      p=p->next;
    }
    while(p!=NULL){
     p=p->next;
     q=q->next;
    }
    q->next=(q->next)->next;
 return dummy.next;
}
