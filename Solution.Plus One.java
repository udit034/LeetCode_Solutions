public class Solution {
    public int[] plusOne(int[] digits) {
        if( digits.length < 1 ) return digits;
        int[] res = new int[ digits.length + 1 ];
        int carry = 1;
        for( int i = (digits.length - 1); i >= 0; i--  )
        {
            res[i+1] = (digits[i] + carry) % 10;
            if( digits[i] + carry >= 10 )
                carry = 1;
            else
                carry = 0;
        }
        if( carry == 1 )
        {
            res[ 0 ] = 1; 
            return res;
        }
        else
        { 
            for( int i = 0; i < digits.length; i++ )
                digits[i] = res[i+1];
            return digits;
        }
    }
}