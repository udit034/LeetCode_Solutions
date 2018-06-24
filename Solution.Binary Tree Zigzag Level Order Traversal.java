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
    
    public class TreeNodeL
    {
        TreeNode n;
        int l;
        
        public TreeNodeL( TreeNode a, int b )
        {
            this.n = a;
            this.l = b;
        }
    }
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if( root == null ) 
            return new ArrayList<>();
        List<TreeNodeL> q = new ArrayList<TreeNodeL>();
        List<List<Integer>> res = new ArrayList<>();
        
        
        q.add( new TreeNodeL( root, 0 ) );
        
        while( !q.isEmpty() )
        {
            TreeNodeL curr = q.remove(0);
            
            if( curr.l < res.size() )
                res.get( curr.l ).add( curr.n.val );
            else
            {
                res.add( curr.l, new ArrayList<Integer>() );
                res.get( curr.l ).add( curr.n.val );
            }
        
             if( curr.n.left != null )
                    q.add( new TreeNodeL( curr.n.left, curr.l + 1 ) );
            if( curr.n.right != null )
                    q.add( new TreeNodeL( curr.n.right, curr.l + 1 ) );
        }
        
        for( int i = 1; i < res.size(); i = i + 2 )
        {
            Collections.reverse( res.get(i) );
        }
        
        return res;
    }
}