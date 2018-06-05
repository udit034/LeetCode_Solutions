class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet< String > dup = new HashSet< String >();
        
        Arrays.sort( nums );
        
        boolean flag = true;
        for( int i = 0; i < nums.length; i++ )
            if( nums[i] != 0 )
                flag = false;
        if( flag && nums.length > 2 )
        {
                        ArrayList< Integer > r = new ArrayList< Integer >();
                        r.add(0 );
                        r.add(0 );
                        r.add( 0 );
                        res.add( r );
                        return res;
        }
        
        
        for( int i = 0; i < nums.length; i++ )
        {
            int j = i + 1;
            int k = nums.length - 1;
            while( j < k )
            {
                if( nums[i] + nums[j] + nums[k] < 0 )
                    j++;
                else if( nums[i] + nums[j] + nums[k] > 0 )
                    k--;
                else
                {
                               // System.out.println( "TRIPLET " + nums[i] + " " + nums[j] + " " + nums[k] );

                        ArrayList< Integer > r = new ArrayList< Integer >();
                        r.add( nums[i] );
                        r.add( nums[j] );
                        r.add( nums[k] );
                        Collections.sort( r );
                    String temp = String.valueOf(nums[i] ) + String.valueOf( nums[j] ) + String.valueOf( nums[k] );
                        if( !dup.contains( temp ) )
                        {
                             dup.add( temp );
                             res.add( r );
                        }
                        j++;
                        k--;
                    }
                }
            }
            return res;
        }
    }