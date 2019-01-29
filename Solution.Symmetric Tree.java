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
    /*ArrayList<Integer> a = new ArrayList<Integer>();
    public void InOrder( TreeNode root )
    {
        if( root == null ) return;
        
        InOrder( root.left );
        
        a.add( root.val );
        
        InOrder( root.right );
    }*/
    
    /* InOrder( root );
        
        int h = a.size() - 1;
        for( int i = 0; i < (a.size()/2); i++ )
        {
            if( a.get(i) != a.get(h) )
                return false;
            h--;
        }
        return true;*/
    
    public boolean Sym( TreeNode left, TreeNode right )
    {
        if( left == null && right == null )
            return true;
        if( left == null  || right == null || ( left.val != right.val )  )
            return false;
        return Sym( left.left, right.right ) && Sym( left.right, right.left );
        
    }
    
    public boolean isSymmetric(TreeNode root) {
        if( root == null ) return true;
        if( ( root.left == null && root.right != null ) || ( root.left != null && root.right == null ) )
            return false;
        
        return Sym( root.left, root.right );
    }
}