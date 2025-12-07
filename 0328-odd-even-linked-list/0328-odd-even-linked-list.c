/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* oddEvenList(struct ListNode* head) {
    struct ListNode * result = NULL ,*temp1=NULL ,* even=NULL, *temp2=NULL , * node;
    int j = 1 ;
    
    while (head != NULL ){
        node = (struct ListNode * )malloc(sizeof(struct ListNode)) ;
        node->val = head->val;
        node->next = NULL ;
        if(j % 2 == 1 ) {
            if (result == NULL ) {
                result = node ;
                temp1 = result ;

            }
            else {
                temp1->next = node ;
                temp1 = temp1->next ;
            }
            


        }
        else {
            if(even == NULL){
                even = node ;
                temp2 = even ;
            }
            else {
                temp2 -> next = node ;
                temp2 = temp2->next ;
            }
        }
        head = head->next ;
        j++;
    }
        if (temp1 != NULL ) 
            temp1->next = even ;
    
        return result ;
    

    
}