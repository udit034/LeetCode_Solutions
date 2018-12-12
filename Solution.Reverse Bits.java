public class Solution {
    // you need treat n as an unsigned value
    
    public int getBit( int n, int b )
    {
        return ( n >> b ) & 1;
    }
    
    public int setBit( int n, int b )
    {
        int mask = 1 << b;
        return n | mask;
    }
    
    public int reverseBits(int n) {
        if( n == 0 ) return 0;
        int temp = 0;
        for( int i = 0; i < 32; i++ )
        {
            int bit = getBit( n, i );
            if( bit == 1 )
                temp = setBit( temp, 31 - i );
            System.out.println( i + " " + bit + " " + temp );
            
        }
        return temp;
    }
}