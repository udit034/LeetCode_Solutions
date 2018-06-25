class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean res = ( n  & 1 ) == 1 ? false : true;
        while( n > 0 )
        {
            boolean prevRes = res;
            //System.out.println( n + " " + res + " " + prevRes );
            if( ( n & 1 ) == 1 )
                res = true;
            else
                res = false;
            if( res == prevRes )    
                return false;
            n = n >> 1;
        }
        return true;
    }
}