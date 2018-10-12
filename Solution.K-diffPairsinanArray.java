class Solution {
    public int findPairs(int[] nums, int k) {
        if( k < 0 ) return 0;
        
        HashSet< Integer > h = new HashSet< Integer >();
        int count = 0;
        HashSet< Integer > d = new HashSet< Integer >();
        
        for( int n : nums )
        {
            boolean flag = h.add(n); 
            if( k == 0 && flag == false )
                d.add( n );
        }
            
        for( int n : h )
            if( k != 0 && h.contains( n + k ) )
                count++;
        
        return k == 0 ? d.size() : count;
    }
}