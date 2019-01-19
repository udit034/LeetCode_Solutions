public class Solution {
    
    public void printQ( int[][] m, int x1, int y1, int x2, int y2, List<Integer> r )
    {
        if( x1 == x2 && y1 == y2 )
        {
            r.add( m[x1][y1] );
            m[x1][y1] = -9876543;
            return;
        }
        
        for( int t = y1; t <= y2; t++ )
            if( m[x1][t] != -9876543 )
            {
                r.add( m[x1][t] );
                m[x1][t] = -9876543;
            }
        
        for( int t = x1 + 1; t <= x2; t++ )
            if( m[t][y2] != -9876543 )
            {
               r.add( m[t][y2] );
               m[t][y2] = -9876543;
            }
        
        for( int t = y2 - 1; t >= y1; t-- )
            if( m[x2][t] != -9876543 )
            {
               r.add( m[x2][t] );
                m[x2][t] = -9876543;
            }
    
        for( int t = x2 - 1; t > x1; t-- )
            if( m[t][y1] != -9876543 )
            {
                r.add( m[t][y1] );
                m[t][y1] = -9876543;
            }
        
        return ;
    }
    
    public List<Integer> spiralOrder(int[][] matrix) {
        if( matrix.length == 0 ) return new ArrayList<Integer>();
        List<Integer> r = new ArrayList< Integer >();
        //printQ( matrix,  0, 0, 2, 2, r );
        int x1 = 0, y1 = 0, x2 = matrix.length-1, y2 = matrix[0].length-1;
        while( x1 <= x2 && y1 <= y2 )
            printQ( matrix,  x1++, y1++, x2--, y2--, r );
        
        return r;
    }
}