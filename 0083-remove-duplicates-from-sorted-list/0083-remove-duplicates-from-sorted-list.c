/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode *prev=NULL;
    struct ListNode * curr=head;
    if(curr==NULL )
        return NULL;
    while(curr->next!= NULL){
        prev=curr;
        curr=curr->next;
        if(prev->val==curr->val){
            prev->next=curr->next;
            free(curr);
            curr=prev;

        }

    }
    return head;
    
}