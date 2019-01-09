public class Solution {
    
    public void zeroIt( int[][] a, int i, int j )
    {
        int r = a.length;
        int c = a[0].length;
        for( int b = 0; b < r; b++ )
        {
            if( a[b][j] == 0 )
            {
                a[b][j] = -28072807;
               zeroIt( a, b, j );
            }
                a[b][j] = -28072807;
        }
        for( int b = 0; b < c; b++ )
        {
            if( a[i][b] == 0 )
            {
                a[i][b] = -28072807;
               zeroIt( a, i, b);
            }
               a[i][b] = -28072807;
        }
    }
    
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        if( r <= 1 && c <= 1 ) return;
        for( int i= 0; i< r; i++ )
        {
            for( int j= 0; j< c; j++ ) 
            {
                if( matrix[i][j] == 0 )
                    zeroIt( matrix, i, j );
            }
        }
        for( int i= 0; i< r; i++ )
        {
            for( int j= 0; j< c; j++ ) 
            {
                if( matrix[i][j] == -28072807)
                    matrix[i][j] = 0;
            }
        }
    }
}