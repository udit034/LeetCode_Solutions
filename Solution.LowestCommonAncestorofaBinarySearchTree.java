/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public TreeNode lowestCommonAncestorUtil( TreeNode root, TreeNode p, TreeNode q )
    {
        if( root == null )
            return null;
        
        if(p.val < root.val && q.val < root.val )
            return lowestCommonAncestorUtil( root.left, p, q );
        else if(p.val > root.val && q.val > root.val )
            return lowestCommonAncestorUtil( root.right, p, q );
        return root;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowestCommonAncestorUtil( root, p, q );
    }
}