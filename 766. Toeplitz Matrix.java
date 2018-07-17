class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
      for( int m = 0; m < matrix.length; m++ )  
        for( int t = 0; t < matrix[0].length; t++ )
        {
            int j = t, i = m;
            while( (i+1) >= 0 && (i+1) < matrix.length && (j+1) >= 0 && (j+1) < matrix[0].length )
            {
                if( matrix[i][j] != matrix[ i+1 ][ j + 1 ] )
                    return false;
                i += 1;
                j += 1;
            }
        }
        return true;
    }
}