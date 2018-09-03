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
    
    public int getHeight( TreeNode root )
    {
        if( root == null )
            return 0;
        return 1 + Math.max( getHeight( root.left ), getHeight( root.right ) );
    }
    
    public void getNodesAtHeight( TreeNode root, ArrayList< Integer > res, int height, int cur )
    {
        if( root == null )
            return;
        if( height == cur ){
            res.add( root.val );
            return;
        }
        getNodesAtHeight( root.left, res, height, cur + 1 );
        getNodesAtHeight( root.right, res, height, cur + 1 );
    }
    
    public int findBottomLeftValue(TreeNode root) {
        int height = getHeight( root );
        //System.out.println( height );
        
        ArrayList< Integer > res = new ArrayList< Integer >();
        getNodesAtHeight( root, res, height, 1 );
        
        return res.get(0);
    }
}