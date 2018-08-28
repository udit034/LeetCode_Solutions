public class Solution {
    
    public int peak( int[] nums, int low, int high )
    {
        if( low <= high )
        {
            int mid = ( low + high ) / 2;
            
            if( mid == 0 && nums[1] > nums[0] )
                return peak( nums, mid+1, high );
            
            if( mid > 0 && nums[mid] > nums[mid-1] && (mid < (nums.length-1)) && nums[mid] > nums[mid+1])
                return mid;
            else if( mid > 0 && nums[mid] <  nums[mid-1] )
                return peak( nums, low, mid-1 );
            else if( (mid < (nums.length-1)) && nums[mid+1] > nums[mid] )
                return peak( nums, mid+1, high );
        }
        return -1;
    }
    
    public int findPeakElement(int[] nums) {
        if( nums.length == 0 ) return 0;
        if( nums.length == 1 ) return 0;
        if( nums[0] > nums[1] ) return 0;
        if( nums[nums.length-1] > nums[nums.length-2] ) return nums.length-1;
        /*for( int i = 1; i < nums.length-1; i++ )
            if( nums[i] > nums[i-1] && nums[i] > nums[i+1] )
                return i;*/
        return peak( nums, 0, nums.length-1 );
    }
}