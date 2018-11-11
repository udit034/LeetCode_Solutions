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
    
    public TreeNode mergreTreesUtil( TreeNode t1, TreeNode t2 )
    {
        TreeNode n1 = new TreeNode(0);
        if( t1 == null && t2 == null )
            return null;
        if( t1 == null )
            n1 = new TreeNode( t2.val );
        else if( t2 == null )
            n1 = new TreeNode( t1.val );
        else
            n1 = new TreeNode( t1.val + t2.val );
        
        
        n1.left = mergreTreesUtil( t1 == null ? null : t1.left, t2 == null ? null : t2.left );
        n1.right = mergreTreesUtil(  t1 == null ? null : t1.right, t2 == null ? null : t2.right );
        
        return n1;
    }
    
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return mergreTreesUtil( t1, t2 );
    }
}