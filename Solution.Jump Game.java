public class Solution {
    
    public boolean canJump(int[] nums) {
        if( nums.length == 1 && nums[0] <= 1 ) return true;
        if( nums.length == 0 ) return true;
        
        int[] NTC = new int[ nums.length ];
        int[] dist = new int[ nums.length ];
        dist[ nums.length - 1 ] = 0;
        NTC[ nums.length - 1 ] = 1;
        
        int i = nums.length - 2;
        int nextZero = nums.length - 1;
        while( i >= 0 )
        {
            NTC[ i ] = nextZero - i;
            if( nums[ i ] >= NTC[ i ] )
            {
                 dist[ i ] = 0;
                 nextZero = i;   
            }
            else
                dist[ i ] = 1;
            i--;
        }
        
        if( dist[0] == 0 )
            return true;
        else 
            return false;
    }
}