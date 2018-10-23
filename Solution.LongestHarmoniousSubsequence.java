class Solution {
    public int findLHS(int[] nums) {
        HashMap< Integer, Integer > h = new HashMap< Integer, Integer >();
        
        for( int i : nums )
            if( !h.containsKey(i) )
                h.put(i, 1);
            else
                h.put( i, h.get(i) + 1 );
            
        int max = 0;
        for( int k : h.keySet() )
        {
            if( h.containsKey( k+1) )
                if( h.get(k+1) + h.get(k) > max )
                    max = h.get(k+1) + h.get(k);
        }
        return max;
    }
}