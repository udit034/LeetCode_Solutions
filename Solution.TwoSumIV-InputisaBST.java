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
    
    public void findUtil( TreeNode root, ArrayList<Integer> a )
    {
        if( root == null )
            return;
        a.add( root.val );
        findUtil( root.left, a );
        findUtil( root.right, a );
    }
    
    public boolean findTarget(TreeNode root, int k) {
        ArrayList< Integer > a = new ArrayList< Integer >();
        findUtil( root, a );
        Collections.sort( a );
        
        int l = 0;
        int h = a.size() - 1;
        while( l < h )
        {
            int low = a.get(l);
            int high = a.get(h);
            if( low + high > k )
                h--;
            else if( low + high < k )
                l++;
            else
                return true;
        }
        return false;
    }
}