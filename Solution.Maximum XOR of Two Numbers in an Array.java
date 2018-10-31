class Solution {
    public int findMaximumXOR(int[] nums) {
        if( nums.length == 1 )
            return 0;
        int max = Integer.MIN_VALUE;
        for( int i = 0; i < nums.length; i++ )
            for( int j = i+1; j < nums.length; j++ )
                if( ( nums[i] ^ nums[j] ) > max )
                    max = nums[i] ^ nums[j];
        return max;
    }
}