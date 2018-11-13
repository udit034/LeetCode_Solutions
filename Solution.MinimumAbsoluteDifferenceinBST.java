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
    
    public void getTreeUtil( TreeNode root, ArrayList<Integer> a )
    {
        if( root == null )
            return;
        a.add( root.val );
        getTreeUtil( root.left, a );
        getTreeUtil( root.right, a );
    }
    
    public int getMinimumDifference(TreeNode root) {
        ArrayList< Integer > a = new ArrayList< Integer >();
        getTreeUtil( root, a );
        Collections.sort( a );
        int min = Integer.MAX_VALUE;
        for( int i = 1; i < a.size(); i++ )
            if( a.get(i) - a.get(i-1) < min )
                min = a.get(i) - a.get(i-1);
        return min;
    }
}