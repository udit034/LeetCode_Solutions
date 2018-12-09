public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for( int b = 0; b < nums.length; b++ )
            h.put( nums[b], b );
        
        Arrays.sort( nums );
        
        String[] s = new String[ nums.length ];
        int count = 1;
        
        for( int i = nums.length - 1; i >= 0; i--, count++ )
        {
            if( count == 1 )
                s[ h.get( nums[i] ) ] = "Gold Medal";
            else if( count == 2)
                s[ h.get( nums[i] ) ] = "Silver Medal";
            else if( count == 3)
                s[ h.get( nums[i] ) ] = "Bronze Medal";
            else
                s[ h.get( nums[i] ) ] = String.valueOf( count );
        }
        
        return s;
    }
}