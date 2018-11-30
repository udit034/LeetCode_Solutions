public class Solution {
    public int numSquares(int n) {
        if( n <= 1 ) return 1;
        int[] dp = new int[ n+1 ];
        dp[1] = 1;
        dp[2] = 2;
        int nS = 2;
        for( int i = 3; i <= n; i++ )
        {
            int Cmin = Integer.MAX_VALUE;
            if( nS * nS == i )
            {
                    Cmin = 1;
                    nS++;    
            }
            else
            {
                for( int s = 1; s < nS; s++ )
                    if( Cmin > dp[ s*s] + dp[ i - (s*s) ] )
                        Cmin = dp[ s*s] + dp[ i - (s*s) ];
            }
            dp[i] = Cmin;
        }
        return dp[n];
    }
}