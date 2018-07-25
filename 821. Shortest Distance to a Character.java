class Solution {
    public int[] shortestToChar(String S, char C) {
        ArrayList< Integer > a  = new ArrayList< Integer >();
        for( int i = 0; i < S.length(); i++ )
            if( S.charAt( i ) == C )
                a.add( i );
        ArrayList< Integer > result = new ArrayList< Integer >();
        for( int i = 0; i < S.length(); i++ )
            if( S.charAt( i ) != C )
            {
                int index = -Collections.binarySearch( a,  i ) - 1;
                int min = Integer.MAX_INT;
                if( index >= 0 && index < a.size() )
                    min = a.get( index ) - i;
                if( index + 1 < a.size() )
                    min = Math.min( min, a.get( index + 1 ) - i );
                if( index - 1 >= 0 )
                    min = Math.min( min, Math.abs( a.get( index - 1 ) - i ) );
                result.add( min );
            }
            else
                result.add( 0 );
        return result.stream().mapToInt( i -> i ).toArray( );
    }
}