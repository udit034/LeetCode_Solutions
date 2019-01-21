class Solution {
    public boolean checkRecord(String s) {
        int maxL = Integer.MIN_VALUE;
        int curL = 0;
        boolean flag = false;
        for( int i = 0; i < s.length(); i++ )
        {
            if( !flag && s.charAt(i) == 'A' )
                flag = true;
            else if( flag && s.charAt(i) == 'A' )
                return false;
            
            if( s.charAt(i) == 'L' ){
                curL++;
                maxL = Math.max( curL, maxL );
            }
            else if( s.charAt(i) != 'L' && curL > 0 )
            {
                curL = 0;
            }
            if( maxL > 2 )
                return false;
        }
        return true;
    }
}