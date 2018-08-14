public class Solution {
    
    public int isLessThan( ArrayList<Integer> a, int n )
    {
        /*int i = 0;
        int count = 0;
        for( ; i < a.size() ; i++ )
        {
            if( a.get(i) < n )
                count++;
        }*/
            
        int temp  = Collections.binarySearch(a, n );
        if( temp <  0)
            temp = -1 - temp;
        
         if( temp < a.size() )
        {
            int cur  = a.get( temp );
            while( temp > 0 && temp < a.size() && (temp-1) >= 0 && a.get( temp - 1 ) == cur ) 
                temp--;
        } 
            
        return temp;
    }
    
    public void insertSoFar( ArrayList<Integer> a, int n )
    {
        /*for( int i = 0; i < a.size(); i++ )
            if( a.get(i) > n )
            {
                a.add( i, n );
                return;
            }
        a.add( n );*/
        int temp  = Collections.binarySearch(a, n );
        if( temp <  0)
            temp = -1 - temp;
        a.add( temp, n );
    }
    
    public List<Integer> countSmaller(int[] nums) {
        if( nums.length <= 0 ) return new ArrayList<Integer>();
        
         ArrayList<Integer> res = new ArrayList<Integer>();
         ArrayList<Integer> soFar = new ArrayList<Integer>();
        
        
        for( int i = nums.length - 1; i >= 0; i-- )
        {
            int temp = nums[i];
            nums[i] = isLessThan( soFar, nums[i] );
            insertSoFar( soFar, temp );
        }
        
        for( int i = 0; i < nums.length; i++ )
            res.add( nums[i] );
        
        return res;
    }
}