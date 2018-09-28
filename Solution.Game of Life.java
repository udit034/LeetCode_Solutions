public class Solution {
    
    public boolean isValid( int i, int j,int m,int n, int[][] board )
    {
        return ( i >= 0 && i < m ) && ( j >= 0 && j < n ) && ( board[i][j] == 1 ); 
    }
    
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] b = new int[ board.length ][ board[0].length ];
        for( int i = 0; i < m; i++ )
        {
            for( int j = 0; j < n; j++ )
            {
                int l = 0;
                if( isValid( i-1, j-1, m, n, board ) ) l++;
                if( isValid( i-1, j, m, n, board ) ) l++;
                if( isValid( i-1, j+1, m, n, board ) ) l++;
                if( isValid( i, j-1, m, n, board ) ) l++;
                if( isValid( i, j+1, m, n, board ) ) l++;
                if( isValid( i+1, j-1, m, n, board ) ) l++;
                if( isValid( i+1, j, m, n, board ) ) l++;
                if( isValid( i+1, j+1, m, n, board ) ) l++;
                
                if( board[i][j] == 1 )
                {
                    if( l < 2 )
                        b[i][j] = 0;
                    else if( l == 2 || l == 3 )
                        b[i][j] = 1;
                    else if( l > 3 )
                        b[i][j] = 0;
                  }
                  else if( board[i][j] == 0 && l == 3 )
                      b[i][j] = 1;
            }
        }
        for( int i = 0; i < m; i++ )
            for( int j = 0; j < n; j++ )
                board[i][j] = b[i][j];
    }
}