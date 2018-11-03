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
    
    public TreeNode binUtil( int[] nums, int l, int h )
    {
        TreeNode root = null;
        if( l < h )
        {
            int max = Integer.MIN_VALUE;
            int ind = l;
            for( int i = l; i < h; i++ )
            {
                if( nums[i] > max )
                {
                    max = nums[i];
                    ind = i;
                }
            }
            //System.out.println( max + " " + ind + " " + l + " " + h );
            root = new TreeNode( max );
            root.left = binUtil( nums, l, ind );
            root.right = binUtil( nums, ind+1, h );
        }
        return root;
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return binUtil( nums, 0, nums.length  );
    }
}