/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public void connectV( TreeLinkNode l, TreeLinkNode r, TreeLinkNode rPar )
    {
        if( l == null &&  r == null )
            return;
        if( l != null && r != null )
        {
            l.next = r;
        }
        if( rPar == null )
            r.next = null;
        else
            r.next = rPar.left;
        connectV( l.left, l.right, r );
        connectV( r.left, r.right, r.next );
    }
    
    public void connect(TreeLinkNode root) {
        if( root == null ) return;
        if( root.left == null && root.right == null ) return;
        connectV( root.left, root.right, null );
    }
}