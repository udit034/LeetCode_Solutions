public class Solution {
    public int longestConsecutive(int[] nums) {
        if( nums.length == 0 ) return 0;
        if( nums.length == 1 ) return 1;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		int max = 0;
		for( int num : nums )
		{
			h.put( num, 1 );
		}
        for( int num : nums )
        {
            int temp = num+1;
            int l = 1;
            if( !h.containsKey(num-1 ) )
            {
                while( h.containsKey(temp) )
                {
                    l++; 
                    temp++;
                }   
            }
            if( l  > max )
                max = l;
        }
		return max;
    }
}