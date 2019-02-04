public class Solution {
    public class Input
    {
        int val;
        int ind;
        public Input( int x, int y )
        {
            this.val = x;
            this.ind = y;
        }
    }
    
    public int[] twoSum(int[] nums, int target) {
        
        ArrayList< Input > a = new ArrayList< Input >();
        
        for( int i = 0; i < nums.length; i++ )
            a.add( new Input( nums[i], i ) );
        
        Collections.sort( a, new Comparator<Input>()
                         {
                            public int compare( Input a, Input b )
                            {
                                if( a.val == b.val )
                                    return a.ind - b.ind;
                                return a.val - b.val;
                            }
                         } );
        int j = nums.length - 1;
        for( int i = 0; i < j; )
        {
            if(  ( a.get(i).val + a.get(j).val ) < target )
                i++;
            else if(  ( a.get(i).val + a.get(j).val )  > target )
                j--;
            else
            {
                int[] res = { a.get(i).ind, a.get(j).ind };
                return res;
            }
        }
        return new int[2];
    }
}