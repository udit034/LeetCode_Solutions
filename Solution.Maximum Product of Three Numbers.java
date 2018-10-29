public class Solution {
    public int maximumProduct(int[] nums) {
        
        int size = nums.length;
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        for( int num : nums )
            a.add( num );
        Collections.sort( a );
        
        for( int b = 0; b < a.size(); b++ )
            nums[b] = a.get(b);
        
        if((nums[0] > 0 && nums[size-1] < 0 ) || ( nums[0] <0 && nums[size-1] >0 ))
	            return Math.max( ( nums[0] * nums[1] * nums[size - 1 ] ), ( nums[size-1] * nums[size-2] * nums[size-3] ));
	        else
	            return nums[size-1] * nums[size-2] * nums[size-3];
        
    }
}