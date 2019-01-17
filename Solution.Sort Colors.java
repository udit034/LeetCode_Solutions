public class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ones = 0;
        for( int i = 0; i < nums.length; i++ )
        {
            if( nums[i] == 0 )
                nums[low++] = 0;
            else if( nums[i] == 1 )
                ones++;
        }
        for( int i = low; i <= high; i++ )
            if(ones-- > 0)
                nums[i] = 1;
            else
                nums[i] = 2;
    }
}