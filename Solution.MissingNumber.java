class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for( int num : nums )
            sum += num;
        int l = nums.length + 1;
        return ( ( l * ( l - 1 ) ) / 2 ) - sum;
        
    }
}