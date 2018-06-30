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
    
    public void binaryTreePathsUtil( TreeNode root, String cur, HashSet< String > h )
    {
        if( root == null )
            return;
        if( root != null && root.left == null && root.right == null )
        {
            h.add( cur.equals("") ? String.valueOf( root.val ) : cur + "->" + root.val );
            return;
        }
        
        binaryTreePathsUtil( root.left, cur.equals("") ? String.valueOf( root.val ) : cur + "->" + root.val, h );
        
        binaryTreePathsUtil( root.right, cur.equals("") ? String.valueOf( root.val ) : cur + "->" + root.val, h );
        
        
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        HashSet< String > h = new HashSet< String >();
        binaryTreePathsUtil( root, "", h );
        return new ArrayList< String >( h );
    }
}