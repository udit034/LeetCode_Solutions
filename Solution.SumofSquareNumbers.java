class Solution {
    public boolean judgeSquareSum(int c) {
        int l = 0;
        int h = ( int ) Math.sqrt( c );
        //System.out.println( h );
        while( h >= l )
        {
            if( l * l + l * l == c )
                return true;
            if( h * h + h * h == c )
                return true;
            if( l * l + h * h == c )
                return true;
            if( l * l + h * h > c )
                h--;
            else if( l * l + h * h < c )
                l++;
        }
        return false;
    }
}