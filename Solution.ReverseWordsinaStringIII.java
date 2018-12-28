class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String res = "";
        for( int i = 0; i < str.length; i++ )
        {
            StringBuffer b = new StringBuffer();
            b.append( str[i] );
            if( res.equals("") )
                res += b.reverse().toString();
            else
                res += " " + b.reverse().toString();
        }
        return res;
    }
}