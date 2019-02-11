class Solution {
    public int uniquePaths(int m, int n) {
        if( m <= 1 && n <= 1 )
            return 1;
        int large = ( m > n ? m : n ) - 1;
        int small = ( large == m-1 ? n : m ) - 1;
        
        
        long kraken = 1;
        int denominator = 1;
        
        for( int i = 1; i <= ( large + small ); i++ )
        {
            kraken *= i;
            kraken /= denominator++;
            if( denominator > large )
                denominator = 1;
        }
        
        return ( int ) kraken;
    }
}