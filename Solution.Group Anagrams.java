public class Solution {
    
    /*public Input
    {
        String orig;
        String sorted;
        public Input( String x, String y ) { this.orig = x; this.sorted = y; };
    }*/
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        
        HashMap< String, ArrayList<String> > h = new HashMap< String, ArrayList< String >>();
        
        for( int i = 0; i < strs.length; i++ )
        {
            char[] temp = new char[ strs[i].length() ];
            for( int z = 0; z < strs[i].length(); z++ )
                temp[z] = strs[i].toCharArray()[z];
            Arrays.sort( temp );
            
            String t = new String( temp );
            if( h.containsKey(t) )
                h.get( t ).add( strs[i] );
            else
            {
                h.put( t, new ArrayList<String>() );
                h.get( t ).add( strs[i] );
            }
        }
        
        for( ArrayList<String> cur : h.values() )
        {
            //ArrayList<String> temp = new ArrayList<String>();
            res.add(  cur );
            //for( int b = 0; b < cur.size(); b++ )
            //    temp.add( cur.get(b) );
        }
        
        /* ArrayList<String> sorted = new ArrayList<String>();
        for( int i = 0; i < strs.length; i++ )
            sorted.add( new Input( strs[i], new String( Arrays.sort( strs[i].toCharArray() ) ) )   );
        
        Collections.sort( sorted, new Compartor<Input>() 
                         {
                             public int Compare( Input x, Input y )
                             {
                                 return x.compareTo(y);
                             }
                         }); */
        
        
        return res;
        
    }
}