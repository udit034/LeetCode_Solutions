class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap< String, Integer > h1 = new HashMap< String, Integer >();
        for( int i = 0; i < list1.length; i++ )
            h1.put( list1[i], i );
        
        HashMap< String, Integer > h2 = new HashMap< String, Integer >();
        for( int i = 0; i < list2.length; i++ )
            h2.put( list2[i], i );
        
        int min = Integer.MAX_VALUE;
        
        
        for( String key1 : h1.keySet() )
        {
            if( h2.containsKey( key1) )
            {
                if( h1.get( key1) + h2.get(key1) < min )
                    min = h1.get( key1) + h2.get(key1);
            }
        }
        
        //System.out.println( min );
        
        ArrayList< String > res = new ArrayList< String >();
        for( String key1 : h1.keySet() )
        {
            if( h2.containsKey( key1 ) )
            {
                if( h1.get( key1) + h2.get(key1) == min )
                    res.add( key1 );
            }
        }
        
        
        String[] stringArray = res.toArray(new String[0]);
        return stringArray;
        
    }
}