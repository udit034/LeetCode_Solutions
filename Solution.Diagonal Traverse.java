class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if( matrix.length == 0 )
            return new int[0];
        ArrayList< ArrayList< Integer > > h = new ArrayList< ArrayList< Integer > >();
        for( int i = 0; i <= matrix.length + matrix[0].length - 2; i++ )
            h.add( new ArrayList< Integer >() );
        for( int i = 0; i < matrix.length; i++ )
        {
            for( int j = 0; j < matrix[0].length; j++ )
            {
                h.get( i + j ).add( matrix[i][j] );
            }
        }
        int[] res = new int[ matrix.length * matrix[0].length ];
        int count = 0;
        for( int i = 0; i <= matrix.length + matrix[0].length - 2; i++ )
        {
            ArrayList< Integer > temp = h.get( i );
            if( i % 2 == 0 )
                Collections.reverse( temp );
            for( int j = 0; j < temp.size(); j++ )
                res[ count++ ] = temp.get( j );
        }
        return res;
    }
}