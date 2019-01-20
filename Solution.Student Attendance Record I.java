public class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        int maxL = 0;
        for( int i = 0; i < s.length(); i++ )
        {
            if( s.charAt(i) == 'A' )
            {
                a++;
            }
            if( s.charAt(i) == 'L' )
            {
                l++;
                if( l > maxL )
                    maxL = l;
            }
            if( s.charAt(i) != 'L' )
                l = 0;
            
        }
        return ( a <= 1 ) && ( maxL <= 2 );
    }
}