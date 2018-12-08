class Solution {
    
    public Long getBit( Long n, int i )
    {
        return ( 1 & ( n >> i ) );
    }
    
    
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        
        Long n1 = Long.valueOf( n );
        
        for( int i = 0; i < 32; i++ )
            if( getBit( n1, i ) == 1 )
                count++;
        
        if( count == 1 && n > 0 )
            return true;
        
        return false;
    }
}