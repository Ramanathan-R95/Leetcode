/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode* left=head;
    struct ListNode* right=head;
    while (right!=NULL){
        while(right && left->val==right->val)
            right=right->next;
        left->next=right;
        left=right;
    }
    return head;
    
}