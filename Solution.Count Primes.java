public class Solution {
    public int countPrimes(int n) {
    
        if( n-1 <= 1 ) return 0;
        if( n-1 == 2 ) return 1;
        if( n-1 == 3 ) return 2;
        
        boolean[] a  = new boolean[n];
        
        for( int i = 2; i < n; i++ )
            a[i] = true;
        
        a[0] = false;
        a[1] = false;
        
        for( int i = 2; i * i <= n; i++ )
                for( int j = 2 * i; j < n; j = j + i )
                     a[j] = false;
        
        int count  = 0;
        
        for( int i = 0; i < n; i++ )
            if( a[i] )
                count++;
        
        return count;
        
    }
}