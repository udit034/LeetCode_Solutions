public class Solution {
    public int findKthLargest(int[] nums, int k) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for( int i = 0; i < nums.length; i++ )
            a.add( nums[i] );
        Collections.sort( a );
        return a.get( a.size() - k );
    }
}