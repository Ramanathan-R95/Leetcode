/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 int res=-1;
 int height(struct TreeNode* node){
    if(node==0)
        return 0;
    int l=height(node->left);
    int r=height(node->right);
    int m=(l>r?l:r);
    res=(res>l+r?res:l+r);
    return 1+m ;
    
}
int diameterOfBinaryTree(struct TreeNode* root) {
    res=-1;
    height(root);
    return res;



    
}
