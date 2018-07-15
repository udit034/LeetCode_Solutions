class Solution {
    public boolean isDiv( int n )
    {
        String num = String.valueOf( n );
        if( num.indexOf('0') >= 0 )
            return false;
        for( int i = 0; i < num.length(); i++ )
            if( n % Integer.parseInt( String.valueOf( num.charAt( i ) ) ) != 0 )
                return false;
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List< Integer > l = new ArrayList< Integer >();
        for( int i = left; i <= right; i++ )
            if( isDiv( i ) )
                l.add( i );
        return l;
    }
}