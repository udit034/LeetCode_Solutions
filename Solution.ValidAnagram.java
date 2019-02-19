class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[ 26 ];
        for( char c : s.toCharArray() )
            a[ c - 'a' ]++;
        for( char c : t.toCharArray() )
            if( a[ c - 'a']-- <= 0 )
                return false;
        
        for( int i = 0; i < 26; i++ )
            if( a[i] > 0 )
                return false;
        
        
        return true;
            
    }
}