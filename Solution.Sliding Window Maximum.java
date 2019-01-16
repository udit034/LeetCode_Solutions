public class Solution {
    
    public int findMax( int[] a, int low, int high )
    {
        int max = Integer.MIN_VALUE;
        int ind = -1;
        for( int i = low; i <= high; i++ )
        {
            if( a[i] > max )
            {
                max = a[i];
                ind = i;
            }
        }
        return ind;
    }
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        if( nums.length == 0 ) return new int[0];
        if( k == 1 ) 
            return nums;
        int[] res = new int[ nums.length - k + 1 ];
        int l = 0;
        int h = k - 1;
        int z = 0;
        int ind = findMax( nums, l, h );
        while( h < nums.length )
        {
            if( l > 0 )
            {
                if( nums[h] > nums[ind] )
                    ind = h;
            }
            res[z++] = nums[ind];
            if( ind == l )
                ind = findMax( nums, l + 1, h );
            l++;
            h++;
        }
        return res;
    }
}