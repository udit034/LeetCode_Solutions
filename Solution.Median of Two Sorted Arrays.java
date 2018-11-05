class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int[] a = new int[ total ];
        int ind = 0;
        
        int i = 0; 
        int j = 0;
        
        while( i < nums1.length && j < nums2.length  )
        {
            if( nums1[i] < nums2[j]  )
                a[ ind++ ] = nums1[ i++ ];
            else
                a[ ind++ ] = nums2[ j++ ];
        }
        while( i < nums1.length )
            a[ ind++ ] = nums1[ i++ ];
        while( j < nums2.length )
            a[ ind++ ] = nums2[ j++ ];
        
        if( total % 2 == 0 )
            return ( ( double ) a[ total / 2 - 1 ] + ( double )  a[ total / 2  ] ) / 2;
        else
            return a[ total / 2 ];
        
        
        
    }
}