class Solution {
    public String convertToBase7(int num) {
        if( num == 0 ) return "0";
        boolean neg = false;
        if( num < 0 ){
            num = Math.abs( num );
            neg = true;
        }
        int r = 0;
        String res = "";
        while( num > 0 )
        {
            res = String.valueOf( num % 7 ) + res;
            num = num / 7;
        }
        return neg == true ? "-"+ res : res;
    }
}