class Solution {
    public boolean isUgly(int num) {
        if( num == 1 ) return true;
        if( num <= 0 ) return false;
        
        Long n = new Long( num );
        
        while( n % 2  == 0 )
            n = n / 2;
        while( n % 3  == 0 )
            n = n / 3;
        while( n % 5  == 0 )
            n = n / 5;
        
        return n == 1 ? true : false;
        
        
    }
}