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
    int max = 0;
    public int diamUtil( TreeNode root )
    {
        if( root == null )
            return 0;
        int left = diamUtil( root.left );
        int right = diamUtil( root.right  );
        System.out.println( root.val + " " + left + " " + right );
        max = Math.max( max, left+right );
        return Math.max( left, right ) + 1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if( root == null ) return 0;
        diamUtil( root  );   
        return max;
    }
}