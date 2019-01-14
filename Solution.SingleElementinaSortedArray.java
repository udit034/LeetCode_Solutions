class Solution {
    public int singleNonDuplicate(int[] nums) {
        int a = nums[0];
        for( int i = 1; i < nums.length; i++ )
            a ^= nums[i];
        return a;
    }
}