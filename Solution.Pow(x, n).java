public class Solution {
    public double myPow(double x, int n) {
        Double r = 1.0;
        boolean neg =  n < 0 ? true : false;
        long n1 =  Math.abs( (long) n );
        
        for( long i = 0; i < n1; i++ )
        {
            double rprev = r;
            if( neg )
                r = (double) r / (double) x;
            else
                r =  (double) r * ( double ) x;
            if( Math.abs( r - rprev ) <= 0.0000000001  )
                break;
            
            if( Math.abs(r) == Math.abs(rprev) )
                if( x > 0 )
                    return x;
                else
                    if( n1 % 2 != 0 )
                        return x;
                    else
                        return -x;
        }
        return r;
    }
}