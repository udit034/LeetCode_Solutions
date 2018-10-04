public class Solution {
    public int strStr(String haystack, String needle) {
        if( haystack.equals("") && needle.equals("") ) return 0;
        for( int i = 0; i < haystack.length(); i++ )
        {
            if(  i + needle.length() <= haystack.length() && haystack.substring( i, i + needle.length() ).equals( needle ) )
                return i;
        }
        return -1;
    }
}