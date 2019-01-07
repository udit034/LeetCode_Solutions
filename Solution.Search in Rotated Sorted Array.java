public class Solution {
    
    public int BS( int[] a, int low, int high, int target )
    {
        System.out.println( low + " " + high );
        if( low <= high )
        {
            int mid = ( low + high ) / 2;
            if( a[mid] == target )
                return mid;
            if( a[mid] > a[low] ) // left half from mid+1 to high is sorted.
            {
                if( mid > 0 && target >= a[low] && target <= a[mid-1] )
                {
                    System.out.println( "CASE 1 ");
                    return BS( a, low, mid-1, target );    
                }
                else
                {
                    System.out.println( "CASE 2 ");
                    return BS( a, mid+1, high, target );         
                }
            }
            else //left half from low to mid-1 is sorted
            {
                if( mid + 1 <= high && target >= a[mid+1] && target <= a[high] )
                {
                    System.out.println( "CASE 3 ");
                    return BS( a, mid+1, high, target );    
                }
                else
                {
                    System.out.println( "CASE 4 ");
                        return BS( a, low, mid-1, target );        
                }
            }
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        if( nums.length == 0 ) return -1;
        if( nums.length == 1 )
            if( nums[0] == target )
                return 0;
            else
                return -1;
        return BS( nums, 0, nums.length - 1, target );
    }
}