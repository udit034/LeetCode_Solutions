/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if( root == null ) return "";
        String res = String.valueOf( root.val + " " );
        TreeNode n = root;
        ArrayList<TreeNode> q = new ArrayList<TreeNode>();
        q.add( root );
        while( !q.isEmpty() ) 
        {
            TreeNode c = q.get(0);
            q.remove(0);
            res += c.left != null ? String.valueOf(c.left.val) + " ": "# ";
            if( c.left != null )
                q.add( c.left );
            res +=  c.right!= null ? String.valueOf( c.right.val ) + " ": "# ";
            if( c.right != null )
                q.add( c.right );
        }
       //System.out.println( res );
        return res;
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if( data.equals("") ) 
            return null;
        ArrayList<TreeNode> q = new ArrayList<TreeNode>();
        int ind = 0;
        
        String[] a = data.split(" ");
        
        TreeNode root = new TreeNode( Integer.parseInt( a[ind]) );
        q.add( root );
        
        while( !q.isEmpty() )
        {
            TreeNode c = q.get(0);
            q.remove(0);
            
            String left = " ";
            String right = " ";
            
            
            if( 2*ind + 1 < a.length )
                left = a[ 2*ind + 1 ];
            if( 2*ind + 2 < a.length )
                right = a[ 2*ind + 2 ];
            
            
           //System.out.println( left + " " + right );
            
            if( !left.equals("#") )
            {
                 c.left = new TreeNode( Integer.parseInt( left ) );
                 q.add( c.left );   
            }
            else
                c.left = null;
            
            if( !right.equals("#") )
            {
                 c.right = new TreeNode( Integer.parseInt( right ) );
                 q.add( c.right );   
            }
            else
                c.right = null;
            
           ind++; 
        }
        
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));