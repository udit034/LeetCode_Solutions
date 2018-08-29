class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList< Integer > a = new ArrayList< Integer >();
        for( int i = 0; i < nums.length; i++ )
        {
            int ind =  Math.abs( nums[ i ] ) - 1;
            if( nums[ ind ] > 0 )
                nums[ ind ] = -nums[ ind ];
            else
                a.add( ind + 1 );
        }
        
        /*for( int i = 0; i < nums.length; i++ )
        {
            if( nums[i] > 0 )
                a.add( i + 1 );
        }
        */
        return a; 
    }
}