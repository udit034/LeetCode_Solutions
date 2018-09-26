class Solution {
    
    class mchar
    {
        char c;
        int i;
        public mchar( char a, int b )
        {
            this.c = a;
            this.i = b;
        }
    }
    
    public int firstUniqChar(String s) {
        if( s.equals("") ) return -1;
        
        if( s.length() == 1 ) return 0;
        
        ArrayList<mchar> m = new ArrayList< mchar >();
        int j = 0;
        for( char c : s.toCharArray() )
            m.add( new mchar( c, j++ ) );
        
        Collections.sort( m, ( mchar a , mchar b ) -> ( a.c - b.c ) );
        
        
        int min = Integer.MAX_VALUE;
        for( int i = 0; i < m.size(); i++ )  
        {
            //System.out.println( m.get(i).c + " " + m.get(i).i + " " + min );if( i == 0 )
            if( i == 0 && i + 1 < m.size() )    
                if( m.get(i).c != m.get(i+1).c )
                    min = Math.min( min, m.get(i).i );
            
        
            if( i - 1 >= 0 && i == m.size() - 1 )
                if( m.get(i).c != m.get(i-1).c )
                    min = Math.min( min, m.get(i).i );
            
            if( ( i > 0 && m.get(i).c != m.get(i-1).c ) && ( i + 1 < m.size() && m.get(i).c != m.get(i+1).c ) )
                    min = Math.min( min, m.get(i).i );
                
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
        
    }
}