class Solution {
    public boolean checkPerfectNumber(int num) {
        if( num <= 1 ) return false;
        int count = 1;
        for( int i = ( int ) Math.sqrt( num ); i > 0; i-- )
        {
            if( num % i == 0 && i != 1 )
                count += ( i + num/i );
            if( count > num )
                return false;
        }
            
        if( count == num )
            return true;
        else
            return false;
    }
}