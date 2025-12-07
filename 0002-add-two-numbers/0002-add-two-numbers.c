/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode * result=NULL ,* temp=NULL , * temp2;
    int sum ,carry = 0 ;
    while(l1!= NULL || l2!=NULL || carry != 0){
        sum = 0 ;
        sum +=  carry ;
        if (l1 != 0){
            sum += l1 -> val ;

        }
        if(l2 != 0){
            sum += l2 -> val ;
        }
        if (sum > 9) {
            carry = sum / 10 ;
            sum = sum % 10 ;

        }
        else carry = 0 ;
        temp2 = (struct ListNode *) malloc(sizeof(struct ListNode)) ;
        temp2 -> val = sum ;
        temp2 -> next = 0;
        if(result == NULL){
            result = temp2 ;
            temp = temp2 ;

        }
        else {
            temp->next = temp2 ;
            temp = temp -> next ;
        }
        if(l1 != 0)
            l1 = l1->next ;
        if (l2 != 0)
            l2 = l2->next ;




    }
    
    
    return result ;

    
    

    
}