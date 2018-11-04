class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort( nums );
        
        int neg = Integer.MIN_VALUE;
        if( nums[0] < 0 && nums[1] < 0 && nums[ nums.length - 1 ] > 0 )
            neg = nums[0] * nums[1] * nums[ nums.length - 1 ];
        
        return Math.max( neg, nums[ nums.length-1 ] * nums[ nums.length-2 ] * nums[ nums.length-3 ]  );
        
    }
}