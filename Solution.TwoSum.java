class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] temp = new int[ nums.length ];
        for( int i = 0; i < nums.length; i++ )
            temp[ i ] = nums[ i ];
        
        Arrays.sort( nums );
        int l = 0, h = nums.length - 1;
        while( l < h )
        {
            int sum = nums[l] + nums[h];
            if( sum == target && l != h )
            {
                int[] res = new int[2];
                int count = 0;
                for( int i = 0; i < temp.length && count <= 2; i++ )
                    if( temp[i] == nums[l] )
                        res[count++] = i;
                    else if( temp[i] == nums[h] )
                        res[count++] = i;
                return res;
            }
            else if( sum < target )
                l++;
            else
                h--;
        }
        return new int[2];
    }
}