class Solution {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[ s.length()+1 ][ s.length() + 1 ];
        int count = 0;
        for( int i = 0; i <= s.length(); i++ )
            dp[i][i] = true;
        for( int i = s.length()-1; i >= 0; i-- )
        {
            for( int j = i; j < s.length(); j++ )
            {
                if(  s.charAt(i) == s.charAt(j) && ( j - i < 3 || dp[ i + 1 ][ j - 1] ) )
                {
                    count++;
                    dp[i][j] = true;
                }
            }
        }
        return count;
    }
}