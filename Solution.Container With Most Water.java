public class Solution {
    
    public int Area( int a, int b, int[] h )
    {
        return Math.abs( a - b ) * Math.min( h[a], h[b] );
    }
    
    public int maxArea(int[] height) {
        int max = 0;
        /*for( int i = 0; i < height.length; i++ )
            for( int j = i+1; j < height.length; j++ )
            {
                int temp = Area(i,j,height);
                if( temp > max )
                    max = temp;
            }*/
        
        int i = 0;
        int j = height.length - 1;
        while( j > i ) 
        {
            int temp = Area(i, j, height );
            if( temp > max )
                max = temp;
            if( height[j] > height[i] )
                i++;
            else
                j--;
        }
        return max;
    }
}