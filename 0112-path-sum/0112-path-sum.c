/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


bool cal(struct TreeNode * node , int target){
    if(!node)
        return false;
    if(node -> left == NULL && node -> right == NULL && target == node -> val)
        return true;
    bool left = cal(node -> left , target - node -> val );
    bool right = cal(node -> right , target - node -> val);
    return left || right ;


    
    
    
}
bool hasPathSum(struct TreeNode* root, int targetSum) {
    
    return cal(root,targetSum);
    

    
}