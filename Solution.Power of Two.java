public class Solution {
    
    public int getBit( int n, int pos )
    {
        return ( n >> pos ) & 1 ;
    }
    
    public boolean isPowerOfTwo(int n) {
        
        if( n < 0 )
            return false;    
            
        int count = 0;
        
        for( int i = 0; i < 32; i++ )
            if( getBit( n, i ) == 1 )
                count++;
        
        if( count == 1 )
            return true;
        return false;
        
    }
}