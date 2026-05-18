/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool isSameTree(struct TreeNode* p, struct TreeNode* q) {
    if( p == NULL && q == NULL)
        return true;
    else if(p == NULL ||  q == NULL )
        return false;
     
        
    bool left = isSameTree(p -> left,q -> left);
    bool right = isSameTree(p -> right,q -> right);
    if(p -> val != q -> val || left == false  || right == false) 
        return false;
    return true;

    
}