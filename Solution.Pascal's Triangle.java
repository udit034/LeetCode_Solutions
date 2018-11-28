public class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        if( numRows == 0 ) return new ArrayList<>();
        List<List<Integer>> a = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add( 1 );
        a.add( row1 );
        for( int i = 1; i < numRows; i++ )
        {
            ArrayList<Integer> prev = (ArrayList<Integer>) a.get( i - 1 );
            ArrayList<Integer> curr = new ArrayList<Integer>();
            int ind = i;
            
            for( int z = 0; z <= i; z++ )
                curr.add(0);
            
            for( int j = 0; j <= i/2; j++ )
            {
                int temp = 0;
                if( j < prev.size() )
                {
                    temp += prev.get(j);
                    if( j-1 >= 0 )
                        temp += prev.get(j-1);
                }
                curr.set(j, temp );
                curr.set(ind--, temp );
            }
            
            a.add( curr );
        }
        return a;
    }
}