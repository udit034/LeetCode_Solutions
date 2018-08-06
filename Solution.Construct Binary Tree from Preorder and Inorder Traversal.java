/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */



public class Solution {
    
    class Index 
    {
        int index;
    }
    
    TreeNode buildUtil(int in[], int pre[], int inStrt, int inEnd, Index pIndex) 
    {
        // Base case
        if (inStrt > inEnd)
            return null;
 
        /* Pick current node from Preorder traversal using
           postIndex and decrement postIndex */
        TreeNode node = new TreeNode(pre[pIndex.index]);
        (pIndex.index)++;
 
        /* If this node has no children then return */
        if (inStrt == inEnd)
            return node;
 
        /* Else find the index of this node in Inorder
           traversal */
        int iIndex = search(in, inStrt, inEnd, node.val);
 
        /* Using index in Inorder traversal, construct left and
           right subtress */
        node.left = buildUtil(in, pre, inStrt, iIndex - 1, pIndex);
        node.right = buildUtil(in, pre, iIndex + 1, inEnd, pIndex);
 
        return node;
    }
    
    int search(int arr[], int strt, int end, int value) 
    {
        int i;
        for (i = strt; i <= end; i++) 
        {
            if (arr[i] == value)
                break;
        }
        return i;
    }
 

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Index pIndex = new Index();
        pIndex.index = 0;
        return buildUtil(inorder, preorder, 0, inorder.length - 1, pIndex);
    }
}